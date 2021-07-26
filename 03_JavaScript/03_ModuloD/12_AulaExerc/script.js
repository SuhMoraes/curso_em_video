function carregar() {
    var msg = window.document.getElementById('msg')
    var img = window.document.getElementById('image')
    var data = new Date()
    var hora = data.getHours()
    var min = data.getMinutes()
    var sec = data.getSeconds()

    msg.innerHTML = `Agora são <strong>${hora}:${min}:${sec}</strong>`
    
    if (hora >= 0 && hora < 12) {
        img.src = 'manha.jpeg'
        document.body.style.background ='#c66e23'        
    } else if (hora >= 12 && hora < 18) {
        img.src = 'tarde.jpeg'
        document.body.style.background =  '#9c4412'
    } else {
        img.src = 'noite.jpeg'
        document.body.style.background = '#2b6994'
    }
}