package logic

import java.util.*


interface Rule

interface Fact
/*

class Person(val name: String)

class Parent constructor(val parent: Person, val child: Person) : Fact {

    init {
        addToList(this)
    }

    fun isChild(childName: String):Boolean = this.child.name.equals(childName)
    fun isFather(parentName: String):Boolean = this.parent.name.equals(parentName)


    override fun toString(): String {
        return "parent ${parent.name} and child ${child.name}"
    }

    companion object {
        var array = ArrayList<Fact>()

        fun addToList(element: Fact) = array.add(element)
        fun printList() {
            for (i in array) {
                println(i.toString())
            }
        }
    }

}


class AndOperator(left: Fact, right: Fact) : Rule

infix fun Parent.and(other: Parent){


}


fun main(args: Array<String>) {
    var p1 = Person("Anders")
    var p2 = Person("Christian")
    var p3 = Person("Erik")
    var p4 = Person("Dorte")
    var p5 = Person("Niels")

    var f1 = Parent(p5, p3)
    var f2 = Parent(p3, p4)
    var f3 = Parent(p3, p1)
    var f4 = Parent(p1, p2)
    Parent.printList()


    fun Parent(parentName: String = "", childName : String = "", parentList : ArrayList<String>? = null): Any{

        if(parentName.isNotEmpty() && childName.isNotEmpty()) {

            for (i in Parent.array) {
                if (i is Parent && i.parent.name.equals(parentName) && i.child.name.equals(childName)) {
                    return true
                }
            }
            return false

        }else if(parentName.isNotEmpty()){

            var  tmpList = ArrayList<String>()

            for (i in Parent.array) {
                if (i is Parent && i.parent.name.equals(parentName)) {
                    tmpList.add(i.child.name)
                }
            }

            return tmpList

        }else /*if(childName.isNotEmpty())*/{
            var  tmpList = ArrayList<String>()

            for (i in Parent.array) {
                if (i is Parent && i.child.name.equals(childName)) {
                    tmpList.add(i.parent.name)
                }
            }
            return tmpList
        }
    }

    fun GrandFather(gFName: String, childName: String) :Any {

        Parent(parentList = Parent(parentName = gFName), childName = childName)

        Parent(parentName = gFName) and Parent(childName = childName)

    }


    when(Parent("","")){
        is Boolean -> ""
        is Int -> ""
        is ArrayList<*> -> ""


    }


    println(Parent("Anders", "Christian"))
    println(Parent("Anders", "PikkerBob"))
    println(Parent(parentName = "Erik"))
    println(Parent(childName = "Erik"))

    //grandparent
    //fun GrandParent(name: String): Rule = Parent(name) and Parent(name)
    //fun GrandParent(name: String):Fact = Parent(p5,p3) and Parent(p3,p3)

    //GrandParent("jskfl")

    //GrandParent("Niels")


    //var GreatGrandParent = Grandparent and Parent


}*/
