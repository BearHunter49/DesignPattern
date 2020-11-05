package prototype

class Circle(var x: Int, var y: Int, var r: Int) : Shape() {

    fun getInformation(){
        println("Id: ${this.id} ($x, $y) and r: $r")
    }

    fun copy(nx: Int, ny: Int, nr: Int): Circle{
        val circle: Circle = clone() as Circle
        circle.x = nx
        circle.y = ny
        circle.r = nr
        circle.id = this.id + 1
        return circle
    }


}