package sttp.model.internal

private[model] object Rfc3986Compatibility {
  def formatByte(byte: Byte): String = "%02X".format(byte)
}
