const nome = prompt("Qual é o seu nome?");
console.log(`Olá, ${nome}!`);

const idade = prompt("Quantos anos você tem?");
console.log(`Você tem ${idade} anos.`);

if (idade >= 18) {
  console.log("Você é maior de idade!");
} else {
  console.log("Você é menor de idade!");
}
