import Usuario from "../models/Usuario";


//si quiero solicitar un dato metodo get
//si quiero guardar un dato metodo post

export const renderUsuario = async (req, res) => {
  // .lean nos devuelve una lista de typescript
  const usuarios = await Usuario.find().lean();
  //console.log(usuarios);
  //pasamos los usuarios a index
  res.render("index", { usuarios: usuarios });
};
export const createUsuario = async (req, res) => {
  //console.log(req.body)
  try {
    const usuario = Usuario(req.body);
    const usuarioSaved = await usuario.save();
    console.log(usuarioSaved);
    res.redirect("/");
  } catch (error) {
   
    //usuario esta guardado
    
    res.send('este usuario ya existe, si quieres utilizar este usuario haz el login desde la app')
    console.log(error);
  }

  //lo que sale cuando le das al boton registrarse
  //res.send('saved') -->me redirecciona a la página inicial
  //res.redirect("/");
};
export const renderUsuarioEdit = async (req, res) => {
  try {
    const usuario = await Usuario.findById(req.params.id).lean();
    res.render("edit", { usuario });
  } catch (error) {
    console.log(error.message);
  }
};
export const editUsuario = async (req, res) => {
  const { id } = req.params;
  await Usuario.findByIdAndUpdate(id, req.body);

  res.redirect("/"); //nos lleva a la pagina inicial
};
export const deleteUsuario = async (req, res) => {
  const { id } = req.params;
  await Usuario.findByIdAndDelete(id);
  res.redirect("/"); //nos lleva a la pagina inicial
};
