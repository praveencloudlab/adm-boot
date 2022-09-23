fetch("http://localhost:8080/api/flights")
.then(response=>response.text())
.then(data=>{
    console.log(data);
})