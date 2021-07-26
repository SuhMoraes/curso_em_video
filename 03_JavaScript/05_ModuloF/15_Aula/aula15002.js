// Loop simplificado -> Só funciona para array e objetos

let num =[5, 8, 9, 3]
for(let pos in num){
    console.log(`A posição ${pos} tem o valor ${num[pos]}`)
}


// Encontrar o índice
let pos = num.indexOf(5)
num.indexOf()

// -1 -> quer dizer  que o valor não foi encontrado
if (pos == -1){
    console.log("O valor não foi encontrado")
} else{
    console.log(`O índice do valor escolhido é ${pos}`)
}