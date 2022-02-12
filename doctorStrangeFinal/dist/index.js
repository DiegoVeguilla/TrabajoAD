"use strict";

var _interopRequireDefault = require("@babel/runtime/helpers/interopRequireDefault");

var _app = _interopRequireDefault(require("./app"));

require("./database");

var _config = require("./config");

_app["default"].listen(_config.PORT);

console.log("Server on port", _config.PORT);