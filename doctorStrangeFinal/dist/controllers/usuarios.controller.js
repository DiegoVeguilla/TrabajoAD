"use strict";

var _interopRequireDefault = require("@babel/runtime/helpers/interopRequireDefault");

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.renderUsuarioEdit = exports.renderUsuario = exports.editUsuario = exports.deleteUsuario = exports.createUsuario = void 0;

var _regenerator = _interopRequireDefault(require("@babel/runtime/regenerator"));

var _asyncToGenerator2 = _interopRequireDefault(require("@babel/runtime/helpers/asyncToGenerator"));

var _Usuario = _interopRequireDefault(require("../models/Usuario"));

//si quiero solicitar un dato metodo get
//si quiero guardar un dato metodo post
var renderUsuario = /*#__PURE__*/function () {
  var _ref = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee(req, res) {
    var usuarios;
    return _regenerator["default"].wrap(function _callee$(_context) {
      while (1) {
        switch (_context.prev = _context.next) {
          case 0:
            _context.next = 2;
            return _Usuario["default"].find().lean();

          case 2:
            usuarios = _context.sent;
            //console.log(usuarios);
            //pasamos los usuarios a index
            res.render("index", {
              usuarios: usuarios
            });

          case 4:
          case "end":
            return _context.stop();
        }
      }
    }, _callee);
  }));

  return function renderUsuario(_x, _x2) {
    return _ref.apply(this, arguments);
  };
}();

exports.renderUsuario = renderUsuario;

var createUsuario = /*#__PURE__*/function () {
  var _ref2 = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee2(req, res) {
    var usuario, usuarioSaved;
    return _regenerator["default"].wrap(function _callee2$(_context2) {
      while (1) {
        switch (_context2.prev = _context2.next) {
          case 0:
            _context2.prev = 0;
            usuario = (0, _Usuario["default"])(req.body);
            _context2.next = 4;
            return usuario.save();

          case 4:
            usuarioSaved = _context2.sent;
            console.log(usuarioSaved);
            _context2.next = 12;
            break;

          case 8:
            _context2.prev = 8;
            _context2.t0 = _context2["catch"](0);
            res.redirect("/");
            console.log(_context2.t0);

          case 12:
            //lo que sale cuando le das al boton registrarse
            //res.send('saved') -->me redirecciona a la página inicial
            res.redirect("/");

          case 13:
          case "end":
            return _context2.stop();
        }
      }
    }, _callee2, null, [[0, 8]]);
  }));

  return function createUsuario(_x3, _x4) {
    return _ref2.apply(this, arguments);
  };
}();

exports.createUsuario = createUsuario;

var renderUsuarioEdit = /*#__PURE__*/function () {
  var _ref3 = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee3(req, res) {
    var usuario;
    return _regenerator["default"].wrap(function _callee3$(_context3) {
      while (1) {
        switch (_context3.prev = _context3.next) {
          case 0:
            _context3.prev = 0;
            _context3.next = 3;
            return _Usuario["default"].findById(req.params.id).lean();

          case 3:
            usuario = _context3.sent;
            res.render("edit", {
              usuario: usuario
            });
            _context3.next = 10;
            break;

          case 7:
            _context3.prev = 7;
            _context3.t0 = _context3["catch"](0);
            console.log(_context3.t0.message);

          case 10:
          case "end":
            return _context3.stop();
        }
      }
    }, _callee3, null, [[0, 7]]);
  }));

  return function renderUsuarioEdit(_x5, _x6) {
    return _ref3.apply(this, arguments);
  };
}();

exports.renderUsuarioEdit = renderUsuarioEdit;

var editUsuario = /*#__PURE__*/function () {
  var _ref4 = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee4(req, res) {
    var id;
    return _regenerator["default"].wrap(function _callee4$(_context4) {
      while (1) {
        switch (_context4.prev = _context4.next) {
          case 0:
            id = req.params.id;
            _context4.next = 3;
            return _Usuario["default"].findByIdAndUpdate(id, req.body);

          case 3:
            res.redirect("/"); //nos lleva a la pagina inicial

          case 4:
          case "end":
            return _context4.stop();
        }
      }
    }, _callee4);
  }));

  return function editUsuario(_x7, _x8) {
    return _ref4.apply(this, arguments);
  };
}();

exports.editUsuario = editUsuario;

var deleteUsuario = /*#__PURE__*/function () {
  var _ref5 = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee5(req, res) {
    var id;
    return _regenerator["default"].wrap(function _callee5$(_context5) {
      while (1) {
        switch (_context5.prev = _context5.next) {
          case 0:
            id = req.params.id;
            _context5.next = 3;
            return _Usuario["default"].findByIdAndDelete(id);

          case 3:
            res.redirect("/"); //nos lleva a la pagina inicial

          case 4:
          case "end":
            return _context5.stop();
        }
      }
    }, _callee5);
  }));

  return function deleteUsuario(_x9, _x10) {
    return _ref5.apply(this, arguments);
  };
}();

exports.deleteUsuario = deleteUsuario;