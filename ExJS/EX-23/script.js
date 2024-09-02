var print = document.querySelector(".print");

function printXadrez(){
    var XADREZ = [];

    for(let i = 0; i < 4; i++){
        XADREZ[i] = [];
        for(let j = 0; j < 4; j++){
            if(j <= i){
                XADREZ[i][j] = " X ";
                print.innerHTML += XADREZ[i][j];
            }
            else{
                XADREZ[i][j] = " O ";
                print.innerHTML += XADREZ[i][j];
            }
        }
        print.innerHTML += `<br>`;
    }    
}

printXadrez();