<?php
echo "Qual é o seu nome? ";
$nome = trim(fgets(STDIN));
echo "Olá, $nome!\n";

echo "Quantos anos você tem? ";
$idade = (int)trim(fgets(STDIN));
echo "Você tem $idade anos.\n";

if ($idade >= 18) {
    echo "Você é maior de idade!\n";
} else {
    echo "Você é menor de idade!\n";
}
?>