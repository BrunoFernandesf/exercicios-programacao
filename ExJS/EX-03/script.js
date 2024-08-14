var geoGrade = 0;
var algGrade = 0;
var phyGrade = 0;
var avgGrade = 0;

geoGrade = Number(prompt("Type your grade for Geometry"));
algGrade = Number(prompt("Type your grade for Algebra"));
phyGrade = Number(prompt("Type your grade for Physics"));

avgGrade = Math.round((geoGrade + algGrade + phyGrade) / 3);

if(avgGrade >= 7){
    alert(`${avgGrade} -  Good Job`);
}
else if(avgGrade < 4){
    alert(`${avgGrade} - Failed, you really need to work harder!`);
}
else {
    alert(`${avgGrade} - You need to work harder`);
}