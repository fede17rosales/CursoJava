function validarForma(forma){
    var usuario = forma.usuario;
    if(usuario.value== "" || usuario.value == "Escribir usuario"){
        alert("Debe Proporcionar un Usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    if(password.value== "" || password.value.length < 3){
        alert("Debe Proporcionar un Password menos de 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    for(var i=0;i< tecnologias.length;i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    
    var genero = forma.genero;
    var radioSelecionado= false;
    
     for(var i=0;i< genero.length;i++){
        if(tecnologias[i].checked){
            radioSelecionado = true;
        }
    }
    
      if(!radioSelecionado){
        alert("Debe seleccionar un genero");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe Seleccionar una ocupacion");
        return false;
    }
    
    // formulario es valido
    alert("El formulario es valido, enviando datos al servidor");
    return true;
}
