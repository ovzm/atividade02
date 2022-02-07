fun main(args: Array<String>) {

    val calculos = Calculos()

    println("Digite a gravidade: ")
    val gravidade: Float = readLine()!!.toFloat()

    println("Digite a massa: ")
    val massa: Float = readLine()!!.toFloat()

    println("Digite o raio: ")
    val raio: Float = readLine()!!.toFloat()

    println("Digite a valocidade: ")
    val velocidade: Float = readLine()!!.toFloat()

    println("Digite a força: ")
    val forca: Float = readLine()!!.toFloat()

    println("Digite o Tempo Inicial: ")
    val tempoIncial: Float = readLine()!!.toFloat()

    println("Digite o Tempo Final: ")
    val tempoFinal: Float = readLine()!!.toFloat()

    println("Digite a Deformação: ")
    val deformacao: Float = readLine()!!.toFloat()

    println("Digite a Constante Elastica: ")
    val constanteElastica: Float = readLine()!!.toFloat()

    println("Digite a posição final: ")
    val posicaoFinal: Float = readLine()!!.toFloat()

    println("Digite a posição inicial: ")
    val posicaoInicial: Float = readLine()!!.toFloat()

    println("Digite o tempo: ")
    val tempo: Float = readLine()!!.toFloat()

    println("Digite a velocidade inicial: ")
    val velocidadeInicial: Float = readLine()!!.toFloat()

    println("Digite a aceleração: ")
    val aceleracao: Float = readLine()!!.toFloat()

    val forcaPeso = calculos.forcaPeso(massa, gravidade)
    val forcaCentripeta = calculos.forcaCentripeta(massa, velocidade, raio)
    val impulso = calculos.impulso(forca, tempoIncial, tempoFinal)
    val forcaElastica = calculos.forcaElastica(deformacao, constanteElastica)
    val velocidadeMedia = calculos.velocidadeMedia(posicaoInicial, posicaoFinal, tempoIncial, tempoFinal)
    val mru = calculos.mru(posicaoInicial, velocidade, tempo)
    val mruv = calculos.mruv(posicaoInicial, velocidadeInicial, tempo, aceleracao )

    println("o resultado do peso é: $forcaPeso")
    println("o resultado da forca centripeta é: $forcaCentripeta")
    println("o resultado do impulso é: $impulso")
    println("o resultado da constante elastica é: $forcaElastica")
    println("o resultado da velocidade media é: $velocidadeMedia")
    println("o resultado do mru: $mru")
    println("o resultado do mruv: $mruv")

}