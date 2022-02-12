"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports["default"] = void 0;

var _mongoose = require("mongoose");

//definicion de modelo de datos
var usuarioSchema = new _mongoose.Schema({
  Nombreusuario: {
    type: String,
    require: true,
    unique: true,
    trim: true
  },
  Correo: {
    type: String,
    require: true,
    trim: true
  },
  Contrasenia: {
    type: String,
    require: true,
    trim: true
  },
  Telefono: String,
  Genero: String,
  Pais: String,
  Edad: String
}, {
  timestamps: true,
  versionKey: false
});

var _default = (0, _mongoose.model)('Usuario', usuarioSchema);

exports["default"] = _default;