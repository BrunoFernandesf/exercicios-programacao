/**
 * @param {number} x
 * @return {boolean}
 */

let word = prompt("Type the word or numbers that you want to check");
    if(isPalindrome(word) == true){
        alert("The chosen word is a Palindrome");
    }
    else{
        alert("The chosen word is not a Palindrome");
    }

function isPalindrome(x) {
    var text = x.toString();
    
    let start = 0;
    let end = text.length -1;
    let cont = 0;

    while(start < end){
        if(text[start] != text[end]){
            return false
        }

        start++;
        end--;
    }
    return true;
};

