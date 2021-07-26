let num =[5, 8, 9, 3]


// Acrecentando valor no vetor
num[4] = 6
console.log(`1 - Nosso vetor é ${num[0]}`) // Montrando o primeiro valor do vetor

 // acrescentando o último valor 
 num.push(10) 
console.log(`2 - Nosso vetor é ${num}`)

 // Tamanho o vetor
 num.length
 console.log(`3 - Nosso vetor é ${num.length}`)

 // Colocando em ordem crescente
 num.sort()
 
console.log(`4 - Nosso vetor é ${num}`)

// Estrutura for, para ver o comprimento do array/vetor
for(let pos =0; pos<num.length; pos++){
    console.log(num[pos])
}

