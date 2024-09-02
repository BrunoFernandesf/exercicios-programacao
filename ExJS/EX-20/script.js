/**
 * @param {number[]} target
 * @param {number[]} arr
 * @return {boolean}
 */
var canBeEqual = function(target, arr) {
    target.sort((a, b) => a - b);
    arr.sort((a, b) => a - b);

    for(let i = 0; i < target.length; i++){
        if(target[i] != arr[i]){
            return false
        }
    }

    return true;
};

alert(canBeEqual([937,396,309,316,278,305,937,563,385,816,333,523,874,47,281,984,431,692],[937,385,816,937,309,523,281,278,316,396,984,431,47,333,692,874,563,305]));