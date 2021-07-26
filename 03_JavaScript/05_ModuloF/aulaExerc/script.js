// Criando variáveis de componentes básicos
let num = document.getElementById('txtn')
let lista = document.getElementById('flista')
let res = document.getElementById('res')

// Criação de vetor para armazenamento dos números
let valores = []

// Segundo: Duas functions foram definidas para validar as informações

// Function isNumero -> Definição de números
function isNumero(n){
    if(Number(n) >=1 && Number(n) <=100){
        return true
    } else{
        return false
    }
}

function inLista(n, l) {
    if(l.indexOf(Number(n)) != -1){
        return true
    } else {
        return false
    }

}

function adicionar(){
    // Primeiro: Farei uma validação para que seja um número e de até os valores pre definidos
    if (isNumero(num.value)&& !inLista(num.value, valores)){       
        valores.push(Number(num.value))
        let item = document.createElement('option') // Criação do elemento Option
        item.text = `Valor ${num.value} adicionado` // Declarando o valor do elemento na variável item.text
        lista.appendChild(item) // Chamando o elemento 
        res.innerHTML = '' // Limpando o resultado
    }else{
        window.alert('Valor inválido ou já encontrado na lista')
    }
    // apangando o valor no input
    num.value = ''
    num.focus()
}

function finalizar(){
    if(valores.length == 0){
        window.alert('Adicione valores antes de finalizar!')
    }else {
        let tot = valores.length
        let maior = valores[0]
        let menor = valores[0]
        let soma = 0
        let media = 0

        for(let pos in valores){
            soma += valores[pos]
            if(valores[pos] > maior)
            maior = valores[pos]
            if (valores[pos] < menor)
            menor = valores[pos]
        }

        media = soma / tot
        res.innerHTML += ''
        res.innerHTML += `<p> Ao todo, temos ${tot} números cadastrados. </p>`
        res.innerHTML += `<p> O maior valor informado foi ${maior}. </p>`
        res.innerHTML += `<p> O menor valor informado foi ${menor}. </p>`
        res.innerHTML += `<p>A soma de todos os valores, temos ${soma}. </p>`
        res.innerHTML += `<p> A media dos valores digitados ${media}.</p>`
    }
}