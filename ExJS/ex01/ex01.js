function trocaRes() {
    var a = 10;
    var b = 20;
    let c = 0
    
    c = b
    b = a;
    a = c;
    
    console.log(a,b);
    alert("a = "+ a + ", b = "+ b)
}