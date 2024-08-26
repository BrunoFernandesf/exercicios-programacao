/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    return address.replaceAll(".","[.]");
};

alert(defangIPaddr("1.1.1.1"));