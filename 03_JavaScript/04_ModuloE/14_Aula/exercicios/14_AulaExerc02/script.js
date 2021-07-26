function tabuada (){
    let num = document.getElementById('txtn')
    let tab = document.getElementById('seltab')
    // condição para o numero
    if(num.value.length == 0){
        window.alert('Por favor, digite um número!')
    } else{
        let n = Number(num.value)
        let c = 1 // Contador
        tab.innerHTML = '' // limpando a tabuada
        while(c <= 10){ // Loop com teste no início
            let item = document.createElement('option') // Criação de um option
            item.text = `${n} x ${c} = ${n*c}` // A tabuada: n = numero; c = contador
            item.value = `tab${c}`// Item selecionado
            tab.appendChild(item)
            c++ // Contador
        }
    }
}