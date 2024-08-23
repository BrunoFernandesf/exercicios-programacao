/**
 * @param {string[]} strs
 * @return {string}
 */
function longestCommonPrefix(strs) {
    var text = strs[0];

    for(let i = 1; i < strs.length; i++){
        for(let j = 0; j <= strs[i].length; j++){
               if(strs[i][j] != text[j] || j == strs[i].length){
                    text = text.slice(0, j);
                    break;
               }
        }
        if(text == ""){
            break;
        }
    }
    return text;
};