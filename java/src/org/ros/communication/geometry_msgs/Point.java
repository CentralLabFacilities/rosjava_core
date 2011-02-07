/* Auto-generated by genmsg_java.py for file Point.msg */

package org.ros.communication.geometry_msgs;

import org.ros.communication.Message;

import java.nio.ByteBuffer;

public class Point extends Message {

  public double x;
  public double y;
  public double z;

  public Point() {
  }

  public static java.lang.String __s_getDataType() { return "geometry_msgs/Point"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "4a842b65f413084dc2b10fb484ea7f17"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Point clone() {
    Point c = new Point();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 8; // x
    __l += 8; // y
    __l += 8; // z
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putDouble(x);
    bb.putDouble(y);
    bb.putDouble(z);
  }

  public void deserialize(ByteBuffer bb) {
    x = bb.getDouble();
    y = bb.getDouble();
    z = bb.getDouble();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Point))
      return false;
    Point other = (Point) o;
    return
      x == other.x &&
      y == other.y &&
      z == other.z &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.x)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.y)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.z)) ^ (tmp >>> 32));
    return result;
  }

} // class Point

