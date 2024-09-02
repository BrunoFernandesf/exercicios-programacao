var print = document.querySelector(".print");

function printXadrez(){
    var XADREZ = [];

    for(let i = 0; i < 14; i++){
        XADREZ[i] = [];
        for(let j = 0; j < 11; j++){
            if(i >= 2 && i <= 10){
                if(j >= 2 && j <= 7){
                    XADREZ[i][j] = " X ";
                    print.innerHTML += XADREZ[i][j];
                }
                else{
                    XADREZ[i][j] = " O ";
                    print.innerHTML += XADREZ[i][j];
                }
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