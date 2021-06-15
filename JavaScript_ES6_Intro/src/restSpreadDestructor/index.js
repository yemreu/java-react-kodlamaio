//rest
//params - C#
//varArgs - Java
let showProducts = function(id,...products) {
    console.log(id);
    console.log(products);
}

//console.log(typeof showProducts);

// showProducts(10,["Elma","Armut","Karpuz"]);

//spread
let poinst = [1,2,3,4,50,4,60,14];
// console.log(...poinst);
// console.log(Math.max(...poinst));
// console.log(..."abc","d",..."efg","h");

//destructuring
let populations = [10000,20000,30000,[40000,100000]];
let [small,medium,large,[xLarge,maximum]] = populations;
console.log(small);
console.log(medium);
console.log(large);
console.log(xLarge);
console.log(maximum);

function someFunction([small1],number) {
    console.log(small1);
}

someFunction(populations);

let category = {id:1,name:"içecek"}
console.log(category.id);
console.log(category["name"]);

let {id,name} = category;
console.log(id);
console.log(name);