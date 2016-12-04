<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Phishing</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/ajax.js"></script>
<script>
	function atualizaEndereco(logradouro, bairro, cidade, uf) {
		document.formCadastro.logradouro.value = logradouro;
		document.formCadastro.bairro.value = bairro;
		document.formCadastro.cidade.value = cidade;
		document.formCadastro.uf.value = uf;
	}
</script>
</head>
<body>
	<h3>Cadastro de Usuários</h3>
		<form name="formCadastro">
		
		  <label for="nome">nome</label>
		  <input type="text" name="nome">
		  
		  <label for="cep">cep</label>
		  <button name="botaoConsultar" onclick="doAjaxCall();return false;">consultar</button>
		  <input type="text" name="cep" id="cep">
		  
		  <label for="logradouro">logradouro</label>
		  <input type="text" id="logradouro">
		  
		  <label for="bairro">bairro</label>
		  <input type="text" name="bairro">
		  
		  <label for="cidade">cidade</label>
		  <input type="text" name="cidade">
		  
		  <label for="uf">uf</label>
		  <input type="text" name="uf">
		  <br><br>
		  <button class="submit" name="botaoCadastrar">cadastrar</button>
		  <script type="text/javascript" id="ajaxResponse">
		  </script>
		  
		</form>
</body>
</html>