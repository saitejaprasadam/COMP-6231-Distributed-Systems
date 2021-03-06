package utils.corbaInterface;


/**
* corbaInterface/IDCRSPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./IDCRS.idl
* Wednesday, October 24, 2018 11:11:41 PM EDT
*/

public abstract class IDCRSPOA extends org.omg.PortableServer.Servant
 implements utils.corbaInterface.IDCRSOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("addCourse", new java.lang.Integer (0));
    _methods.put ("removeCourse", new java.lang.Integer (1));
    _methods.put ("listCourseAvailability", new java.lang.Integer (2));
    _methods.put ("enrolCourse", new java.lang.Integer (3));
    _methods.put ("getClassSchedule", new java.lang.Integer (4));
    _methods.put ("dropCourse", new java.lang.Integer (5));
    _methods.put ("swapCourse", new java.lang.Integer (6));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /* Advisor Operations */
       case 0:  // corbaInterface/IDCRS/addCourse
       {
         String advisorId = in.read_string ();
         String courseId = in.read_string ();
         String semester = in.read_string ();
         int capacity = in.read_long ();
         boolean $result = false;
         $result = this.addCourse (advisorId, courseId, semester, capacity);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // corbaInterface/IDCRS/removeCourse
       {
         String advisorId = in.read_string ();
         String courseId = in.read_string ();
         String semester = in.read_string ();
         boolean $result = false;
         $result = this.removeCourse (advisorId, courseId, semester);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // corbaInterface/IDCRS/listCourseAvailability
       {
         String advisorId = in.read_string ();
         String semester = in.read_string ();
         org.omg.CORBA.Any $result = null;
         $result = this.listCourseAvailability (advisorId, semester);
         out = $rh.createReply();
         out.write_any ($result);
         break;
       }


  /* Student Operations */
       case 3:  // corbaInterface/IDCRS/enrolCourse
       {
         String studentId = in.read_string ();
         String courseId = in.read_string ();
         String semester = in.read_string ();
         org.omg.CORBA.Any $result = null;
         $result = this.enrolCourse (studentId, courseId, semester);
         out = $rh.createReply();
         out.write_any ($result);
         break;
       }

       case 4:  // corbaInterface/IDCRS/getClassSchedule
       {
         String studentId = in.read_string ();
         org.omg.CORBA.Any $result = null;
         $result = this.getClassSchedule (studentId);
         out = $rh.createReply();
         out.write_any ($result);
         break;
       }

       case 5:  // corbaInterface/IDCRS/dropCourse
       {
         String studentId = in.read_string ();
         String courseId = in.read_string ();
         boolean $result = false;
         $result = this.dropCourse (studentId, courseId);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 6:  // corbaInterface/IDCRS/swapCourse
       {
         String studentId = in.read_string ();
         String newCourseId = in.read_string ();
         String oldCourseId = in.read_string ();
         org.omg.CORBA.Any $result = null;
         $result = this.swapCourse (studentId, newCourseId, oldCourseId);
         out = $rh.createReply();
         out.write_any ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:corbaInterface/IDCRS:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public IDCRS _this() 
  {
    return IDCRSHelper.narrow(
    super._this_object());
  }

  public IDCRS _this(org.omg.CORBA.ORB orb) 
  {
    return IDCRSHelper.narrow(
    super._this_object(orb));
  }


} // class IDCRSPOA
