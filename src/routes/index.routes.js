import { request, Router } from "express";
//import Usuario from "../models/Usuario";

import {
  renderUsuario,
  createUsuario,
  renderUsuarioEdit,
  editUsuario,
  deleteUsuario,
} from "../controllers/usuarios.controller";

const router = Router();


//PAGINA INDEX
//devuelve la lista de usuarios
router.get("/", renderUsuario);

//ruta que añade el usuario al darle al boton
router.post("/usuarios/add", createUsuario);

//PAGINA ABOUT
/* router.get("/about", (req, res) => {
  res.render("about");
}); */



//PAGINA EDIT
//lleva a edit --> /:id para llegar a un usuario especificio
router.get("/usuario/:id/edit", renderUsuarioEdit);

//(1) metodo para update
router.post("/usuario/:id/edit", editUsuario);

// metodo para delete
router.get("/usuario/:id/delete", deleteUsuario);

export default router;
