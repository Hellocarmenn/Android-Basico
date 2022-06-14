var myint = 25
var mylong = 30L
var b1: Byte = Byte.MIN_VALUE
var b2: Byte = Byte.MAX_VALUE

println(b1)
println(b2)

var s1: Short = Short.MIN_VALUE
var s2: Short = Short.MAX_VALUE

println(s1)
println(s2)

var c1: Char = Char.MIN_VALUE
var c2: Char = Char.MAX_VALUE

println(c1)
println(c2)

var i1: Int = Int.MIN_VALUE
var i2: Int = Int.MAX_VALUE

println(i1)
println(i2)

var f1: Float = Float.MIN_VALUE
var f2: Float = Float.MAX_VALUE

println(f1)
println(f2)

var l1: Long = Long.MIN_VALUE
var l2: Long = Long.MAX_VALUE

println(l1)
println(l2)

var d1: Double = Double.MIN_VALUE
var d2: Double = Double.MAX_VALUE

println(d1)
println(d2)

var char: Char = 'a'
println(char)

char = '\u611B'
print(char)


//variables nulas
var a1: String? = null
a1 = "Algo"
println( a1?.length)
a1 = null
a1?.let{println(it)}





