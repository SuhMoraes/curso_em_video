function soma2 (n3=0, n4=0){
    return n3 + n4
}
console.log(soma2(2)) //  -> Com a declaraçao de Zero


// Declarando Zero, se o valor de N1 ou N2 
// não for passado
function soma (n1, n2){
    return n1 + n2
}
console.log(soma(2)) // NaN -> Sem a declaraçao de Zero
console.log(soma(2,5))