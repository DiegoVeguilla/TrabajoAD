"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports["default"] = void 0;

var _express = require("express");

var _usuarios = require("../controllers/usuarios.controller");

//import Usuario from "../models/Usuario";
var router = (0, _express.Router)(); //PAGINA INDEX
//devuelve la lista de usuarios

router.get("/", _usuarios.renderUsuario); //ruta que añade el usuario al darle al boton

router.post("/usuarios/add", _usuarios.createUsuario); //PAGINA ABOUT

/* router.get("/about", (req, res) => {
  res.render("about");
}); */
//PAGINA EDIT
//lleva a edit --> /:id para llegar a un usuario especificio

router.get("/usuario/:id/edit", _usuarios.renderUsuarioEdit); //(1) metodo para update

router.post("/usuario/:id/edit", _usuarios.editUsuario); // metodo para delete

router.get("/usuario/:id/delete", _usuarios.deleteUsuario);
var _default = router;
exports["default"] = _default;