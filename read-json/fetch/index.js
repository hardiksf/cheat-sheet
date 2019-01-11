let section = document.querySelector('section');

fetch('./data.json')
    .then(function(response) {
        return response.json();
    })
    .then(function(jsonResponse) {
        const jsonStringifyData = JSON.stringify(jsonResponse);
        const propertyNames = Object.keys(jsonResponse);

        section.innerHTML = `jsonStringifyData: JSON.stringify(jsonResponse) <br> ${jsonStringifyData}
        <br><br>propertyNames: Object.keys(jsonResponse)<br> ${propertyNames} 
        <br><br>jsonResponse.glossary.title<br>${jsonResponse.glossary.title}      
        `;
        console.log(jsonStringifyData);
    })