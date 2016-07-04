import math as python_lib_Math
import math as Math
import os as RandomOs
import inspect as python_lib_Inspect


class _hx_AnonObject:
	def __init__(self, fields):
		self.__dict__ = fields


class Enum:
	_hx_class_name = "Enum"
	_hx_fields = ["tag", "index", "params"]
	_hx_methods = ["__str__"]

	def __init__(self,tag,index,params):
		self.tag = None
		self.index = None
		self.params = None
		self.tag = tag
		self.index = index
		self.params = params

	def __str__(self):
		if (self.params is None):
			return self.tag
		else:
			return (((HxOverrides.stringOrNull(self.tag) + "(") + HxOverrides.stringOrNull(",".join([python_Boot.toString1(x1,'') for x1 in self.params]))) + ")")



class HxString:
	_hx_class_name = "HxString"
	_hx_statics = ["charCodeAt", "substr"]

	@staticmethod
	def charCodeAt(s,index):
		if ((((s is None) or ((len(s) == 0))) or ((index < 0))) or ((index >= len(s)))):
			return None
		else:
			return ord(s[index])

	@staticmethod
	def substr(s,startIndex,_hx_len = None):
		if (_hx_len is None):
			return s[startIndex:]
		else:
			if (_hx_len == 0):
				return ""
			return s[startIndex:(startIndex + _hx_len)]


class Cyph:
	_hx_class_name = "Cyph"
	_hx_statics = ["addressSpace", "services", "options", "generateGuid", "initiateSession"]

	@staticmethod
	def generateGuid(length):
		randomBytes = SecureRandom.getSecureRandomBytes(length)
		_g = 0
		while (_g < length):
			i = _g
			_g = (_g + 1)
			v = python_internal_ArrayImpl._get(Cyph.addressSpace, Math.floor(((randomBytes.b[i] / 256) * len(Cyph.addressSpace))))
			randomBytes.b[i] = (v & 255)
		guid = randomBytes.toString()
		randomBytes.fill(0,length,0)
		return guid

	@staticmethod
	def initiateSession(options = None):
		if (options is None):
			options = []
		return (((((("https://" + HxOverrides.stringOrNull(((Cyph.services.video if ((python_internal_ArrayImpl.indexOf(options,Cyph.options.video,None) > -1)) else (Cyph.services.voice if ((python_internal_ArrayImpl.indexOf(options,Cyph.options.voice,None) > -1)) else Cyph.services.chat))))) + "/#") + HxOverrides.stringOrNull((("&" if ((python_internal_ArrayImpl.indexOf(options,Cyph.options.modestBranding,None) > -1)) else "")))) + HxOverrides.stringOrNull((("$" if ((python_internal_ArrayImpl.indexOf(options,Cyph.options.disableP2P,None) > -1)) else "")))) + HxOverrides.stringOrNull((("%" if ((python_internal_ArrayImpl.indexOf(options,Cyph.options.nativeCrypto,None) > -1)) else "")))) + HxOverrides.stringOrNull(Cyph.generateGuid(26)))


class EnumValue:
	_hx_class_name = "EnumValue"


class SecureRandom:
	_hx_class_name = "SecureRandom"
	_hx_statics = ["getSecureRandomBytes"]

	@staticmethod
	def getSecureRandomBytes(length):
		reason = ""
		try:
			out = haxe_io_Bytes.alloc(length)
			_hx_str = RandomOs.urandom(length)
			_g = 0
			while (_g < length):
				n = _g
				_g = (_g + 1)
				v = HxString.charCodeAt(_hx_str,n)
				out.b[n] = (v & 255)
			return out
		except Exception as _hx_e:
			_hx_e1 = _hx_e.val if isinstance(_hx_e, _HxException) else _hx_e
			e = _hx_e1
			reason = ("" + Std.string(e))
		raise _HxException(("Can't find a secure source of random bytes. Reason: " + ("null" if reason is None else reason)))


class Std:
	_hx_class_name = "Std"
	_hx_statics = ["string"]

	@staticmethod
	def string(s):
		return python_Boot.toString1(s,"")


class haxe_io_Bytes:
	_hx_class_name = "haxe.io.Bytes"
	_hx_fields = ["length", "b"]
	_hx_methods = ["fill", "getString", "toString"]
	_hx_statics = ["alloc"]

	def __init__(self,length,b):
		self.length = None
		self.b = None
		self.length = length
		self.b = b

	def fill(self,pos,_hx_len,value):
		_g = 0
		while (_g < _hx_len):
			i = _g
			_g = (_g + 1)
			pos1 = pos
			pos = (pos + 1)
			self.b[pos1] = (value & 255)

	def getString(self,pos,_hx_len):
		if (((pos < 0) or ((_hx_len < 0))) or (((pos + _hx_len) > self.length))):
			raise _HxException(haxe_io_Error.OutsideBounds)
		return self.b[pos:pos+_hx_len].decode('UTF-8','replace')

	def toString(self):
		return self.getString(0,self.length)

	@staticmethod
	def alloc(length):
		return haxe_io_Bytes(length, bytearray(length))



class haxe_io_Eof:
	_hx_class_name = "haxe.io.Eof"
	_hx_methods = ["toString"]

	def toString(self):
		return "Eof"


class haxe_io_Error(Enum):
	_hx_class_name = "haxe.io.Error"

	@staticmethod
	def Custom(e):
		return haxe_io_Error("Custom", 3, [e])
haxe_io_Error.Blocked = haxe_io_Error("Blocked", 0, list())
haxe_io_Error.Overflow = haxe_io_Error("Overflow", 1, list())
haxe_io_Error.OutsideBounds = haxe_io_Error("OutsideBounds", 2, list())


class python_Boot:
	_hx_class_name = "python.Boot"
	_hx_statics = ["keywords", "toString1", "fields", "simpleField", "getInstanceFields", "getSuperClass", "getClassFields", "prefixLength", "unhandleKeywords"]

	@staticmethod
	def toString1(o,s):
		if (o is None):
			return "null"
		if isinstance(o,str):
			return o
		if (s is None):
			s = ""
		if (len(s) >= 5):
			return "<...>"
		if isinstance(o,bool):
			if o:
				return "true"
			else:
				return "false"
		if isinstance(o,int):
			return str(o)
		if isinstance(o,float):
			try:
				if (o == int(o)):
					def _hx_local_1():
						def _hx_local_0():
							v = o
							return Math.floor((v + 0.5))
						return str(_hx_local_0())
					return _hx_local_1()
				else:
					return str(o)
			except Exception as _hx_e:
				_hx_e1 = _hx_e.val if isinstance(_hx_e, _HxException) else _hx_e
				e = _hx_e1
				return str(o)
		if isinstance(o,list):
			o1 = o
			l = len(o1)
			st = "["
			s = (("null" if s is None else s) + "\t")
			_g = 0
			while (_g < l):
				i = _g
				_g = (_g + 1)
				prefix = ""
				if (i > 0):
					prefix = ","
				st = (("null" if st is None else st) + HxOverrides.stringOrNull(((("null" if prefix is None else prefix) + HxOverrides.stringOrNull(python_Boot.toString1((o1[i] if i >= 0 and i < len(o1) else None),s))))))
			st = (("null" if st is None else st) + "]")
			return st
		try:
			if hasattr(o,"toString"):
				return o.toString()
		except Exception as _hx_e:
			_hx_e1 = _hx_e.val if isinstance(_hx_e, _HxException) else _hx_e
			pass
		if (python_lib_Inspect.isfunction(o) or python_lib_Inspect.ismethod(o)):
			return "<function>"
		if hasattr(o,"__class__"):
			if isinstance(o,_hx_AnonObject):
				toStr = None
				try:
					fields = python_Boot.fields(o)
					fieldsStr = None
					_g1 = []
					_g11 = 0
					while (_g11 < len(fields)):
						f = (fields[_g11] if _g11 >= 0 and _g11 < len(fields) else None)
						_g11 = (_g11 + 1)
						x = ((("" + ("null" if f is None else f)) + " : ") + HxOverrides.stringOrNull(python_Boot.toString1(python_Boot.simpleField(o,f),(("null" if s is None else s) + "\t"))))
						_g1.append(x)
					fieldsStr = _g1
					toStr = (("{ " + HxOverrides.stringOrNull(", ".join([x1 for x1 in fieldsStr]))) + " }")
				except Exception as _hx_e:
					_hx_e1 = _hx_e.val if isinstance(_hx_e, _HxException) else _hx_e
					e2 = _hx_e1
					return "{ ... }"
				if (toStr is None):
					return "{ ... }"
				else:
					return toStr
			if isinstance(o,Enum):
				o2 = o
				l1 = len(o2.params)
				hasParams = (l1 > 0)
				if hasParams:
					paramsStr = ""
					_g2 = 0
					while (_g2 < l1):
						i1 = _g2
						_g2 = (_g2 + 1)
						prefix1 = ""
						if (i1 > 0):
							prefix1 = ","
						paramsStr = (("null" if paramsStr is None else paramsStr) + HxOverrides.stringOrNull(((("null" if prefix1 is None else prefix1) + HxOverrides.stringOrNull(python_Boot.toString1((o2.params[i1] if i1 >= 0 and i1 < len(o2.params) else None),s))))))
					return (((HxOverrides.stringOrNull(o2.tag) + "(") + ("null" if paramsStr is None else paramsStr)) + ")")
				else:
					return o2.tag
			if hasattr(o,"_hx_class_name"):
				if (o.__class__.__name__ != "type"):
					fields1 = python_Boot.getInstanceFields(o)
					fieldsStr1 = None
					_g3 = []
					_g12 = 0
					while (_g12 < len(fields1)):
						f1 = (fields1[_g12] if _g12 >= 0 and _g12 < len(fields1) else None)
						_g12 = (_g12 + 1)
						x1 = ((("" + ("null" if f1 is None else f1)) + " : ") + HxOverrides.stringOrNull(python_Boot.toString1(python_Boot.simpleField(o,f1),(("null" if s is None else s) + "\t"))))
						_g3.append(x1)
					fieldsStr1 = _g3
					toStr1 = (((HxOverrides.stringOrNull(o._hx_class_name) + "( ") + HxOverrides.stringOrNull(", ".join([x1 for x1 in fieldsStr1]))) + " )")
					return toStr1
				else:
					fields2 = python_Boot.getClassFields(o)
					fieldsStr2 = None
					_g4 = []
					_g13 = 0
					while (_g13 < len(fields2)):
						f2 = (fields2[_g13] if _g13 >= 0 and _g13 < len(fields2) else None)
						_g13 = (_g13 + 1)
						x2 = ((("" + ("null" if f2 is None else f2)) + " : ") + HxOverrides.stringOrNull(python_Boot.toString1(python_Boot.simpleField(o,f2),(("null" if s is None else s) + "\t"))))
						_g4.append(x2)
					fieldsStr2 = _g4
					toStr2 = (((("#" + HxOverrides.stringOrNull(o._hx_class_name)) + "( ") + HxOverrides.stringOrNull(", ".join([x1 for x1 in fieldsStr2]))) + " )")
					return toStr2
			if (o == str):
				return "#String"
			if (o == list):
				return "#Array"
			if callable(o):
				return "function"
			try:
				if hasattr(o,"__repr__"):
					return o.__repr__()
			except Exception as _hx_e:
				_hx_e1 = _hx_e.val if isinstance(_hx_e, _HxException) else _hx_e
				pass
			if hasattr(o,"__str__"):
				return o.__str__([])
			if hasattr(o,"__name__"):
				return o.__name__
			return "???"
		else:
			return str(o)

	@staticmethod
	def fields(o):
		a = []
		if (o is not None):
			if hasattr(o,"_hx_fields"):
				fields = o._hx_fields
				return list(fields)
			if isinstance(o,_hx_AnonObject):
				d = o.__dict__
				keys = d.keys()
				handler = python_Boot.unhandleKeywords
				for k in keys:
					a.append(handler(k))
			elif hasattr(o,"__dict__"):
				a1 = []
				d1 = o.__dict__
				keys1 = d1.keys()
				for k in keys1:
					a.append(k)
		return a

	@staticmethod
	def simpleField(o,field):
		if (field is None):
			return None
		field1 = None
		if field in python_Boot.keywords:
			field1 = ("_hx_" + field)
		elif ((((len(field) > 2) and ((ord(field[0]) == 95))) and ((ord(field[1]) == 95))) and ((ord(field[(len(field) - 1)]) != 95))):
			field1 = ("_hx_" + field)
		else:
			field1 = field
		if hasattr(o,field1):
			return getattr(o,field1)
		else:
			return None

	@staticmethod
	def getInstanceFields(c):
		f = None
		if hasattr(c,"_hx_fields"):
			f = c._hx_fields
		else:
			f = []
		if hasattr(c,"_hx_methods"):
			a = c._hx_methods
			f = (f + a)
		sc = python_Boot.getSuperClass(c)
		if (sc is None):
			return f
		else:
			scArr = python_Boot.getInstanceFields(sc)
			scMap = set(scArr)
			res = []
			_g = 0
			while (_g < len(f)):
				f1 = (f[_g] if _g >= 0 and _g < len(f) else None)
				_g = (_g + 1)
				if (not f1 in scMap):
					scArr.append(f1)
			return scArr

	@staticmethod
	def getSuperClass(c):
		if (c is None):
			return None
		try:
			if hasattr(c,"_hx_super"):
				return c._hx_super
			return None
		except Exception as _hx_e:
			_hx_e1 = _hx_e.val if isinstance(_hx_e, _HxException) else _hx_e
			pass
		return None

	@staticmethod
	def getClassFields(c):
		if hasattr(c,"_hx_statics"):
			x = c._hx_statics
			return list(x)
		else:
			return []

	@staticmethod
	def unhandleKeywords(name):
		if (HxString.substr(name,0,python_Boot.prefixLength) == "_hx_"):
			real = HxString.substr(name,python_Boot.prefixLength,None)
			if real in python_Boot.keywords:
				return real
		return name


class python_internal_ArrayImpl:
	_hx_class_name = "python.internal.ArrayImpl"
	_hx_statics = ["indexOf", "_get"]

	@staticmethod
	def indexOf(a,x,fromIndex = None):
		_hx_len = len(a)
		l = None
		if (fromIndex is None):
			l = 0
		elif (fromIndex < 0):
			l = (_hx_len + fromIndex)
		else:
			l = fromIndex
		if (l < 0):
			l = 0
		_g = l
		while (_g < _hx_len):
			i = _g
			_g = (_g + 1)
			if (a[i] == x):
				return i
		return -1

	@staticmethod
	def _get(x,idx):
		if ((idx > -1) and ((idx < len(x)))):
			return x[idx]
		else:
			return None


class _HxException(Exception):
	_hx_class_name = "_HxException"
	_hx_fields = ["val"]
	_hx_methods = []
	_hx_statics = []
	_hx_super = Exception


	def __init__(self,val):
		self.val = None
		message = str(val)
		super().__init__(message)
		self.val = val



class HxOverrides:
	_hx_class_name = "HxOverrides"
	_hx_statics = ["eq", "stringOrNull"]

	@staticmethod
	def eq(a,b):
		if (isinstance(a,list) or isinstance(b,list)):
			return a is b
		return (a == b)

	@staticmethod
	def stringOrNull(s):
		if (s is None):
			return "null"
		else:
			return s

Math.NEGATIVE_INFINITY = float("-inf")
Math.POSITIVE_INFINITY = float("inf")
Math.NaN = float("nan")
Math.PI = python_lib_Math.pi

def _hx_init_Cyph_addressSpace():
	def _hx_local_0(s):
		return HxString.charCodeAt(s,0)
	return list(map(_hx_local_0,["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]))
Cyph.addressSpace = _hx_init_Cyph_addressSpace()
Cyph.services = _hx_AnonObject({'chat': "cyph.im", 'voice': "cyph.audio", 'video': "cyph.video"})
Cyph.options = _hx_AnonObject({'voice': 1, 'video': 2, 'modestBranding': 3, 'disableP2P': 4, 'nativeCrypto': 5})
python_Boot.keywords = set(["and", "del", "from", "not", "with", "as", "elif", "global", "or", "yield", "assert", "else", "if", "pass", "None", "break", "except", "import", "raise", "True", "class", "exec", "in", "return", "False", "continue", "finally", "is", "try", "def", "for", "lambda", "while"])
python_Boot.prefixLength = len("_hx_")