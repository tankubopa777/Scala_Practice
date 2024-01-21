package part2oop

object Enums {
  enum Permissions {
    case READ, WRITE, EXECUTE, NONE
  }
  
  enum PermissionsWithBits(val bits: Int) {
    case READ extends PermissionsWithBits(4)
    case WRITE extends PermissionsWithBits(2)
    case EXECUTE extends PermissionsWithBits(1)
    case NONE extends PermissionsWithBits(0)
  }
  
  def main(args: Array[String]): Unit = {
    val readPermission = Permissions.READ
    val writePermission = PermissionsWithBits.WRITE
    println(readPermission)
    println(writePermission)
    println(writePermission.bits)
  }
}
