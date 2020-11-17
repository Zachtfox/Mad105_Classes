class Employee(var employeeName: String, var employeeNumber: Int, var employeeShift: Int) {

fun printAll(){
    //display info
    // included new line and space to format each employee in a way that is clearly separate.
    println("Name: $employeeName \n Employee ID#: $employeeNumber \n Shift: $employeeShift \n")
}

}