function verificar(){
    var data = new Date()
    var ano = data.getFullYear()
    var fano = document.getElementById('txtano')
    var res = document.getElementById('res')
    if(fano.value.length == 0 ||fano.value > ano){
        window.alert('[ERRO] Verifique os dados e tente novamente')
    } else{
        var fsex = document.getElementsByName('radsex')
        var idade = ano - Number(fano.value)
        var genero =  ''
        var img = document.createElement('img')  // Criação da tag img no Js      
        if(fsex[0].checked){
            genero = 'Mulher'          
            if(idade >=0 && idade < 10){
                img.setAttribute('src', 'girl.jpeg')
            }else if (idade < 21){
                img.setAttribute('src', 'womanYoung.jpeg') // Atribuição da Tag img -> foto
            } else if (idade < 50){
                img.setAttribute('src', 'womanAdult.jpeg')
            } else {
                img.setAttribute('src', 'womanOld.jpeg')
            }
        }else if(fsex[1].checked){
            genero = 'Homem'
            if(idade >=0 && idade < 10){
                img.setAttribute('src', 'boy.jpg')

            }else if (idade < 21){
                img.setAttribute('src', 'menYoung.jpeg')

            } else if (idade < 50){
                img.setAttribute('src', 'menAdult.jpeg')

            } else {
                img.setAttribute('src', 'menOld.jpeg')
                
            }

        }
       
        res.innerHTML = `Detectamos ${genero} com ${idade} anos`
        res.appendChild(img)
        img.style.width = '300px'
        img.style.height = '300px'
        img.style.borderRadius = '50%'
    }
}