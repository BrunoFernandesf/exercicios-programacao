var geoGrade = 0;
var algGrade = 0;
var phyGrade = 0;
var avgGrade = 0;

geoGrade = Number(prompt("Type Geometry grade"));
algGrade = Number(prompt("Type Algebra grade"));
phyGrade = Number(prompt("Type Physics grade"));

avgGrade = Math.round((geoGrade + algGrade + phyGrade) / 3);

alert(`Your average grade is ${avgGrade}`);