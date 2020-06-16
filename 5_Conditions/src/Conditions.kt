fun main() {
    //if-else, when
    val number = (1..100).random()
    println(number)

    if (number % 2 == 0)
        println("$number chia het cho 2")
    else println("$number khong chia het cho 2")

    var result = if (number % 4 == 0) {
        println("$number chia het cho 4")
        300
    } else if (number % 5 == 0) {
        println("$number chia het cho 5")
        1300
    } else if (number % 6 == 0) {
        println("$number chia het cho 6")
        1200
    } else {
        println("$number khong chia het cho 4, 5, 6")
        300
    }

    //luu y: if else va when duoc coi la 1 bieu thuc co the gan if else cho
//    1 bien =, void == unit
//    luu y neu su dung cach gan cho logic if else, bat buoc phai co
//    else thi chuong trinh moi hieu la lay gia tri nao
    println(result)

    //when tuong duong switch case
    when (number) {
        in 1..16 -> {
            println("Chua du tuoi vi thanh nien")
        }

        18 -> {
            println(" den tuoi lay vo")
        }

        in 19..100 -> {
            println("thich lam gi thi lam")
        }

        else -> {
            println("khong biet")
        }
    }


}


