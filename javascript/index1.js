console.log("hey u", 9 + 8, "oih")
//alert("kjhg")
document.write("yemmi")
console.warn(" eda warning")
console.error("yevva error ada nod")

// variables
var vandno = 9
var enondno = 10 //int
console.log(vandno + enondno)
var name = "nanda hesar divya" //string
console.log(name)
var marks = { //objects
    s1: 67,
    s2: 78,
    s3: 89
}
console.log(marks)

var j = true
var h = false
console.log(j, h)//boolean 

var u;
var n = null;
console.log(u)//undefined if ntg is assigned or initialized
console.log(n)// it stores null value


var arr = [1, 2, 3, "kj", 87]
console.log(arr)

//functions
function addd(m, k) {
    return (m + k)//2
}

console.log(addd(8, 7))

c = 68
if (c > 6) {
    console.log("yes")

}
else {
    console.log("no")
}

//for each
arr.forEach(function (e) {
    console.log(e)
})

//array methods
let my=["fam","camera",87,null,true,98,76]
console.log(my.length)
my.pop()
console.log(my)
my.push("div")
console.log(my)
my.shift()
console.log(my)
my.unshift("ggggi")
my.unshift("gk")
console.log(my)
console.log(my.length)
console.log(my.toString())
my.sort()
console.log(my)

//strig methods
let s="divya is good girl is divya"
console.log(s.length)
console.log(s.indexOf("is"))

console.log(s.slice(1,4))
console.log(s.replace("divya","shivani")) //only 1st one it replaces
console.log(s.replaceAll("divya","shivani"))

//date

mydate=new Date();
console.log(mydate)
console.log(mydate.getTime())
console.log(mydate.getHours())
console.log(mydate.getMinutes())
console.log(mydate.getDay())
console.log(mydate.getFullYear())

//doms

let ele = document.getElementById('cc');
    console.log(ele);
document.querySelector('.con2')
document.getElementsByClassName("con2")
document.getElementsByTagName("button")


tn=document.getElementsByTagName("button")
console.log(tn)
t=document.getElementsByTagName("div")
console.log(t)


c=document.createElement('p')
c.innerText="new one"
t[0].appendChild(c)

c2=document.createElement("b")
c2.innerText="na bold"
t[1].appendChild(c2)

c3=document.createElement("h1")
c3.innerText="na dark adeni"
//t[0].replaceChild(c3,c)

//document.getElementsByTagName("div")[1].removeChild(c2)

document.querySelectorAll("div").forEach(function(div){
    div.style.border="7px solid black"
    div.style.backgroundColor="yellow"
})

//events

function clickk(){
    console.log("hey u clicked")
}


/*
window.onload=function(){
    console.log("document was loaded")
}

jaan.addEventListener('click',function(){
    document.querySelector(".con22").innerHTML="<b>u have clicked</b>"
    console.log("click huaaa")
})


jaan.addEventListener("mouseover",function(){
    console.log("mouse hover ho raha")
})


jaan.addEventListener("mouseout",function(){
    console.log("mouse out!!!!!!!!!!!")
})

prev_saved_modala=document.querySelector(".con22").innerHTML;
jaan.addEventListener("mouseup",function(){
    document.querySelector(".con22").innerHTML=prev_saved_modala
    console.log("mouse up???????")
})

jaan.addEventListener("mousedown",function(){
    document.querySelector(".con22").innerHTML="<b> we have clickedd hurryyaa</b>"
    console.log("mouse down.........")
})
*/


//arrow function
summ=(a,b)=>{
    return a+b
}
console.log(summ(7,8))

//setitimeout and setintervals
edamaja=()=>{
    document.getElementById("j").innerHTML="<b> hey na late le barateni nod</b>"
    console.log("na time ada mele barteni")
}
//clrrr=setTimeout(edamaja,2000)
//use clearTimeout(clrrr)

//band=setInterval(edamaja,3000)
//use clearInterval(band)

//localStorage
/*
localStorage.setItem("name",'divya m kumbar')

localStorage.setItem("name",'divyani')

localStorage
Storage {name: 'divyani', length: 1}name: "divyani"length: 1[[Prototype]]: Storage
localStorage.setItem("name",'shivani')
undefined
localStorage
Storage {name: 'shivani', length: 1}name: "shivani"length: 1[[Prototype]]: Storage
localStorage.getItem(name)
null
localStorage.getItem('name')
'shivani'
localStorage.getItem('name')
*/


//JSON used for temporary storage and also used for data transfer

obj={name:"divya",length:"1"}
js=JSON.stringify(obj) //it converts to string
console.log(js)
console.log(typeof(js))
console.log(typeof(obj))
pa=JSON.parse(`{"name":"divya","length":"1"}`)
console.log(pa)
console.log(typeof(pa))


a=87
console.log(`this is ${a}`)






