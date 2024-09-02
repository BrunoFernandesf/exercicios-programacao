var print = document.querySelector(".print");

function printXadrez(){
    var XADREZ = [];

    for(let i = 0; i < 8; i++){
        XADREZ[i] = [];
        for(let j = 0; j < 8; j++){
            if(i % 2 != 0){
                if(j % 2 != 0){
                    XADREZ[i][j] = " X ";
                    print.innerHTML += XADREZ[i][j];
                }
                else{
                    XADREZ[i][j] = " O ";
                    print.innerHTML += XADREZ[i][j];
                }
            }
            else{
                if(j % 2 == 0){
                    XADREZ[i][j] = " X ";
                    print.innerHTML += XADREZ[i][j];
                }
                else{
                    XADREZ[i][j] = " O ";
                    print.innerHTML += XADREZ[i][j];
                }
            }
        }
        print.innerHTML += `<br>`;
    }    
}

printXadrez();