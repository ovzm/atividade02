import kotlin.math.pow

class Calculos {

    //Força Peso
    fun forcaPeso(massa:Float, gravidade:Float):Float{
        return massa * gravidade
    }

    //Força Centrípeta
    fun forcaCentripeta(massa: Float, raio:Float, velocidade:Float):Float{
        return massa * (velocidade.pow(velocidade) / raio )
    }

    //Impulso
    fun impulso(forca:Float, tempoIncial:Float, tempoFinal:Float):Float{
        return forca * (tempoIncial - tempoFinal)
    }

    //Força Elastica
    fun forcaElastica(constanteElastica:Float, deformacao:Float):Float{
        return constanteElastica * deformacao
    }

    //velocidadeMedia
    fun velocidadeMedia(posicaoInicial:Float, posicaoFinal:Float, tempoIncial: Float, tempoFinal: Float):Float{
        return (posicaoInicial - posicaoFinal) / (tempoFinal - tempoIncial)
    }

    //mru
    fun mru(posicaoInicial:Float, velocidade:Float, tempo:Float ):Float{
        return posicaoInicial + velocidade * tempo
    }

    //mruv
    fun mruv(posicaoInicial:Float, velocidadeInicial:Float, tempo: Float, aceleracao: Float):Float{
        return posicaoInicial + velocidadeInicial * tempo + (aceleracao + tempo.pow(tempo) / 2)
    }
}
