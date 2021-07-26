function contador(){
    let ini = document.getElementById('txti')
    let fim = document.getElementById('txtf')
    let pass = document.getElementById('txtp')
    let res = document.getElementById('res')

/* Teste para ver se está funcionando
    if(ini.value.length == 0 || fim.value.length == 0 || txtp.value.length == 0 ){
      window.alert('[ERRO] Faltam dados')
    } else{
        window.alert('Funcionou!')
    }
*/

if(ini.value.length == 0 || fim.value.length == 0 || pass.value.length == 0 ){
    res.innerHTML = 'Impossível Contar'
    window.alert('[ERRO] Faltam dados')
    } else{
        res.innerHTML = 'Contando: '
        let i = Number(ini.value)
        let f = Number(fim.value)
        let p = Number(pass.value)
        // Passo em O , coverteno o Passo 0 em 1
        if(p <= 0){
            window.alert('Pass inválido! Considerando PASSO 1')
            p = 1
        }
        if(i < f){
            // Contagem crescente
            for(let c = i; c <= f; c +=p){
                res.innerHTML += `${c} \u{1F449}`//-> Código Emoji
            }
            res.innerHTML += `\u{1F6D1}`//-> Código Emoji
        } else{
            // Contagem Regressiva
            for(let c = i; c >= f; c -=p){
                res.innerHTML += `${c} \u{1F3C1}  `//-> Código Emoji
            }
            res.innerHTML = ` \u{1F6D1}`
        }        
    }   
    

}