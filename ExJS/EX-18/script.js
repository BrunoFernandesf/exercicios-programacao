/**
 * @param {string} s
 * @return {boolean}
 */
function isValid(s) {
    const pairs = {
        ')': '(',
        '}': '{',
        ']': '['
    };
    
    arr = [];
    if(s.length < 2){
        return false;
    }

    for(let i = 0; i < s.length; i++){
        let char = s[i];

        if(char == '(' || char == '{' || char == '['){
            arr.push(char)
        }
        else if(char == ')' || char == '}' || char == ']'){
            if(arr.pop() != pairs[char]){
                return false;
            }
        } 
    }
    return arr.length === 0;
};