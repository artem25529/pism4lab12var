package ToFileHandOver;

/**
* ToFileHandOver/HandOverHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ToFileHandOver.idl
* 12 ����� 2022 �. 1:44:55 MSK
*/

public final class HandOverHolder implements org.omg.CORBA.portable.Streamable
{
  public ToFileHandOver.HandOver value = null;

  public HandOverHolder ()
  {
  }

  public HandOverHolder (ToFileHandOver.HandOver initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ToFileHandOver.HandOverHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ToFileHandOver.HandOverHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ToFileHandOver.HandOverHelper.type ();
  }

}