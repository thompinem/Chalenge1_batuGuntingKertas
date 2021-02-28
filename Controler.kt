fun randomComputer(opsiParam: Array<String>): String =           //2
    opsiParam[(Math.random() * opsiParam.size).toInt()]                //3

fun ambilPilihanPemain(opsiParam: Array<String>): String {                 /*  */
    var isValidChoice = false
    var pilihanPemain = ""

    while (!isValidChoice) {
        println("Silahkan Pilih Salah Satu: ")         //6
        for (item in opsiParam) print(" $item")                     //7
        println(".")                                                //8

        val inputPemain = readLine()?.toUpperCase()                             //9

        if (inputPemain != null && inputPemain in opsiParam) {        //10
            isValidChoice = true
            pilihanPemain = inputPemain
        }
        if (!isValidChoice) println("Salah ketik, Ketik Yang Benarlah Boss!!!!")    //11
    }
    return pilihanPemain
}


fun hasilAkhir(pilihanPemain: String, pilihanKomputer: String) {                  //12

    val result: String

    if (pilihanPemain == pilihanKomputer) result = "Seri"                                     //13

    else if ((pilihanPemain == "KERTAS" && pilihanKomputer == "BATU") ||
        (pilihanPemain == "BATU" && pilihanKomputer == "GUNTING") ||
        (pilihanPemain == "GUNTING" && pilihanKomputer == "KERTAS"))

        result = "Kamu Menang"
    else result = "Kamu Kalah"

    println("Kamu Memilih $pilihanPemain,Komputer Memilih $pilihanKomputer")

    println(result)                                                                          //14
}

