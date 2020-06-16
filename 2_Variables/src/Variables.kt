fun main() {
    // mutable, immutable

    //mutable: khong the gan lai gia tri
    var email: String = "code4func@gmail.com"
    email = "an2419998@gmail.com"
    println(email)

    //immutable: khong the gan lai gia tri
    val name: String = "Ryan Nguyen"
//    name = "Nguyen Hoang An"
    print(name)

    /*Luu y 1: khi khoi tao bien phai gan gia tri vo
    Luu y 2: trong kotlin khong nhat thiet khai bao
    tuong minh mot kieu du lieu nao*/
//  Example
    var myName = "Nguyen Hoang An"
    print(myName)

    // các kiểu dữ liệu cơ bản (primitive):
    /*
    Int, Long, Float, String, Hex, Binary, Char
     */
    val age: Int = 10
    val myLong: Long = 10L //thêm L in hoa để biết kiểu Long
    val myFloat: Float = 1.2F // them F in hoa de bik kieu Float
    val myHex: Int = 0xFF
    val myBi: Int = 0xb11
    var myChar: Char = 'a'
    var myString: String = "Nguyen Hoang An"

    // kieu du lieu dang String
    //Cach 1:
    val str1: String = "Nguyen Hoang " + "An"

    //Cach 2: muon hien thi multiple line
    val str2: String = """
        SELECT * 
        FROM users
        WHERE
            email = 'ryan@gmail.com
    """
    print(str2)

    //Cach 3: long bien ben ngoai vao string
    val ageString = "i am $age"
    val ageString2 = "i am ${age + 1}"
    print(ageString2)
}