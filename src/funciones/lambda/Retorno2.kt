package funciones.lambda

val calculateGrade = { grade : Int ->
    when(grade) {
        in 0..40 -> "Fail"
        in 41..70 -> "Pass"
        in 71..100 -> "Distinction"
        else -> false
    }
}