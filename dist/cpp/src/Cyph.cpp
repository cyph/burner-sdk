// Generated by Haxe 3.4.2
#include <hxcpp.h>

#ifndef INCLUDED_95f339a1d026d52c
#define INCLUDED_95f339a1d026d52c
#include "hxMath.h"
#endif
#ifndef INCLUDED_Cyph
#include <Cyph.h>
#endif
#ifndef INCLUDED_SecureRandom
#include <SecureRandom.h>
#endif
#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_haxe_Http
#include <haxe/Http.h>
#endif
#ifndef INCLUDED_haxe_io_ArrayBufferViewImpl
#include <haxe/io/ArrayBufferViewImpl.h>
#endif
#ifndef INCLUDED_haxe_io_Bytes
#include <haxe/io/Bytes.h>
#endif
#ifndef INCLUDED_haxe_io_BytesInput
#include <haxe/io/BytesInput.h>
#endif
#ifndef INCLUDED_haxe_io_Input
#include <haxe/io/Input.h>
#endif
#ifndef INCLUDED_haxe_io__UInt32Array_UInt32Array_Impl_
#include <haxe/io/_UInt32Array/UInt32Array_Impl_.h>
#endif

HX_LOCAL_STACK_FRAME(_hx_pos_4d4623eba6a46339_35_generateGuid,"Cyph","generateGuid",0x4feb9d7e,"Cyph.generateGuid","Cyph.hx",35,0x050f2930)
HX_LOCAL_STACK_FRAME(_hx_pos_4d4623eba6a46339_58_request,"Cyph","request",0x7c76dd2f,"Cyph.request","Cyph.hx",58,0x050f2930)
HX_LOCAL_STACK_FRAME(_hx_pos_4d4623eba6a46339_125_generateLink,"Cyph","generateLink",0x533097ef,"Cyph.generateLink","Cyph.hx",125,0x050f2930)
HX_LOCAL_STACK_FRAME(_hx_pos_4d4623eba6a46339_170_initiateSession,"Cyph","initiateSession",0x9ff79fdd,"Cyph.initiateSession","Cyph.hx",170,0x050f2930)
HX_LOCAL_STACK_FRAME(_hx_pos_4d4623eba6a46339_158_initiateSession,"Cyph","initiateSession",0x9ff79fdd,"Cyph.initiateSession","Cyph.hx",158,0x050f2930)
HX_LOCAL_STACK_FRAME(_hx_pos_4d4623eba6a46339_16_boot,"Cyph","boot",0xc2121a52,"Cyph.boot","Cyph.hx",16,0x050f2930)
HX_LOCAL_STACK_FRAME(_hx_pos_4d4623eba6a46339_8_boot,"Cyph","boot",0xc2121a52,"Cyph.boot","Cyph.hx",8,0x050f2930)
static const ::String _hx_array_data_2ca57e4e_10[] = {
	HX_("0",30,00,00,00),HX_("1",31,00,00,00),HX_("2",32,00,00,00),HX_("3",33,00,00,00),HX_("4",34,00,00,00),HX_("5",35,00,00,00),HX_("6",36,00,00,00),HX_("7",37,00,00,00),HX_("8",38,00,00,00),HX_("9",39,00,00,00),HX_("a",61,00,00,00),HX_("b",62,00,00,00),HX_("c",63,00,00,00),HX_("d",64,00,00,00),HX_("e",65,00,00,00),HX_("f",66,00,00,00),HX_("g",67,00,00,00),HX_("h",68,00,00,00),HX_("i",69,00,00,00),HX_("j",6a,00,00,00),HX_("k",6b,00,00,00),HX_("m",6d,00,00,00),HX_("n",6e,00,00,00),HX_("o",6f,00,00,00),HX_("p",70,00,00,00),HX_("q",71,00,00,00),HX_("r",72,00,00,00),HX_("s",73,00,00,00),HX_("t",74,00,00,00),HX_("u",75,00,00,00),HX_("v",76,00,00,00),HX_("w",77,00,00,00),HX_("x",78,00,00,00),HX_("y",79,00,00,00),HX_("z",7a,00,00,00),HX_("A",41,00,00,00),HX_("B",42,00,00,00),HX_("C",43,00,00,00),HX_("D",44,00,00,00),HX_("E",45,00,00,00),HX_("F",46,00,00,00),HX_("G",47,00,00,00),HX_("H",48,00,00,00),HX_("J",4a,00,00,00),HX_("K",4b,00,00,00),HX_("L",4c,00,00,00),HX_("M",4d,00,00,00),HX_("N",4e,00,00,00),HX_("O",4f,00,00,00),HX_("P",50,00,00,00),HX_("Q",51,00,00,00),HX_("R",52,00,00,00),HX_("S",53,00,00,00),HX_("T",54,00,00,00),HX_("U",55,00,00,00),HX_("V",56,00,00,00),HX_("W",57,00,00,00),HX_("X",58,00,00,00),HX_("Y",59,00,00,00),HX_("Z",5a,00,00,00),
};
HX_LOCAL_STACK_FRAME(_hx_pos_4d4623eba6a46339_19_boot,"Cyph","boot",0xc2121a52,"Cyph.boot","Cyph.hx",19,0x050f2930)
HX_LOCAL_STACK_FRAME(_hx_pos_4d4623eba6a46339_26_boot,"Cyph","boot",0xc2121a52,"Cyph.boot","Cyph.hx",26,0x050f2930)

void Cyph_obj::__construct() { }

Dynamic Cyph_obj::__CreateEmpty() { return new Cyph_obj; }

void *Cyph_obj::_hx_vtable = 0;

Dynamic Cyph_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Cyph_obj > _hx_result = new Cyph_obj();
	_hx_result->__construct();
	return _hx_result;
}

bool Cyph_obj::_hx_isInstanceOf(int inClassId) {
	return inClassId==(int)0x00000001 || inClassId==(int)0x2ca57e4e;
}

::Array< ::Dynamic> Cyph_obj::addressSpace;

 ::Dynamic Cyph_obj::services;

 ::Dynamic Cyph_obj::options;

::String Cyph_obj::generateGuid(int length){
            	HX_GC_STACKFRAME(&_hx_pos_4d4623eba6a46339_35_generateGuid)
HXLINE(  36)		int byteLength = (length * (int)4);
HXLINE(  37)		 ::haxe::io::Bytes randomBytes = ::SecureRandom_obj::getSecureRandomBytes(byteLength);
HXLINE(  38)		 ::haxe::io::ArrayBufferViewImpl randomNumbers = ::haxe::io::_UInt32Array::UInt32Array_Impl__obj::fromBytes(randomBytes,null(),null());
HXLINE(  40)		{
HXLINE(  40)			int _g1 = (int)0;
HXDLIN(  40)			int _g = length;
HXDLIN(  40)			while((_g1 < _g)){
HXLINE(  40)				_g1 = (_g1 + (int)1);
HXDLIN(  40)				int i = (_g1 - (int)1);
HXLINE(  41)				{
HXLINE(  41)					::Array< ::Dynamic> v = ::Cyph_obj::addressSpace;
HXLINE(  42)					 ::haxe::io::Bytes _this = randomNumbers->bytes;
HXDLIN(  42)					int pos = (((int)i << (int)(int)2) + randomNumbers->byteOffset);
HXDLIN(  42)					int _this1 = _this->b->__get(pos);
HXDLIN(  42)					::Array< unsigned char > _this2 = _this->b;
HXDLIN(  42)					int a = ((int)_this1 | (int)((int)_this2->__get((pos + (int)1)) << (int)(int)8));
HXDLIN(  42)					::Array< unsigned char > _this3 = _this->b;
HXDLIN(  42)					int a1 = ((int)a | (int)((int)_this3->__get((pos + (int)2)) << (int)(int)16));
HXDLIN(  42)					::Array< unsigned char > _this4 = _this->b;
HXDLIN(  42)					int _hx_int = ((int)a1 | (int)((int)_this4->__get((pos + (int)3)) << (int)(int)24));
HXDLIN(  42)					Float v1;
HXDLIN(  42)					if ((_hx_int < (int)0)) {
HXLINE(  42)						v1 = (((Float)4294967296.0) + _hx_int);
            					}
            					else {
HXLINE(  42)						v1 = (_hx_int + ((Float)0.0));
            					}
HXLINE(  41)					int v2 = v->__get(::Std_obj::_hx_int(::Math_obj::floor((((Float)v1 / (Float)((Float)4294967296.0)) * ::Cyph_obj::addressSpace->length))));
HXDLIN(  41)					randomBytes->b[i] = v2;
            				}
            			}
            		}
HXLINE(  46)		::String guid =  ::haxe::io::BytesInput_obj::__alloc( HX_CTX ,randomBytes,(int)0,length)->readString(length);
HXLINE(  47)		randomBytes->fill((int)0,byteLength,(int)0);
HXLINE(  48)		return guid;
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Cyph_obj,generateGuid,return )

void Cyph_obj::request(::String url,bool post,::Array< ::Dynamic> headers,::Array< ::Dynamic> parameters, ::Dynamic onData, ::Dynamic onError){
            	HX_GC_STACKFRAME(&_hx_pos_4d4623eba6a46339_58_request)
HXLINE( 107)		 ::haxe::Http http =  ::haxe::Http_obj::__alloc( HX_CTX ,url);
HXLINE( 108)		http->onData = onData;
HXLINE( 109)		http->onError = onError;
HXLINE( 111)		{
HXLINE( 111)			int _g = (int)0;
HXDLIN( 111)			while((_g < headers->length)){
HXLINE( 111)				 ::Dynamic o = headers->__get(_g);
HXDLIN( 111)				_g = (_g + (int)1);
HXLINE( 112)				http->setHeader(( (::String)(o->__Field(HX_("k",6b,00,00,00),hx::paccDynamic)) ),( (::String)(o->__Field(HX_("v",76,00,00,00),hx::paccDynamic)) ));
            			}
            		}
HXLINE( 115)		{
HXLINE( 115)			int _g1 = (int)0;
HXDLIN( 115)			while((_g1 < parameters->length)){
HXLINE( 115)				 ::Dynamic o1 = parameters->__get(_g1);
HXDLIN( 115)				_g1 = (_g1 + (int)1);
HXLINE( 116)				http->setParameter(( (::String)(o1->__Field(HX_("k",6b,00,00,00),hx::paccDynamic)) ),( (::String)(o1->__Field(HX_("v",76,00,00,00),hx::paccDynamic)) ));
            			}
            		}
HXLINE( 119)		http->request(post);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC6(Cyph_obj,request,(void))

 ::Dynamic Cyph_obj::generateLink(::Array< int > options, ::Dynamic services){
            	HX_STACKFRAME(&_hx_pos_4d4623eba6a46339_125_generateLink)
HXLINE( 126)		if (hx::IsNull( options )) {
HXLINE( 127)			options = ::Array_obj< int >::__new(0);
            		}
HXLINE( 129)		if (hx::IsNull( services )) {
HXLINE( 130)			services = ::Cyph_obj::services;
            		}
HXLINE( 133)		::String id = ::Cyph_obj::generateGuid((int)7);
HXLINE( 137)		::String _hx_tmp;
HXDLIN( 137)		if ((options->indexOf( ::Dynamic(::Cyph_obj::options->__Field(HX_("video",7b,14,fc,36),hx::paccDynamic)),null()) > (int)-1)) {
HXLINE( 137)			_hx_tmp = ( (::String)(::Cyph_obj::services->__Field(HX_("video",7b,14,fc,36),hx::paccDynamic)) );
            		}
            		else {
HXLINE( 140)			if ((options->indexOf( ::Dynamic(::Cyph_obj::options->__Field(HX_("voice",b2,25,f7,3a),hx::paccDynamic)),null()) > (int)-1)) {
HXLINE( 137)				_hx_tmp = ( (::String)(::Cyph_obj::services->__Field(HX_("voice",b2,25,f7,3a),hx::paccDynamic)) );
            			}
            			else {
HXLINE( 137)				_hx_tmp = ( (::String)(::Cyph_obj::services->__Field(HX_("chat",d8,5e,bf,41),hx::paccDynamic)) );
            			}
            		}
HXLINE( 144)		::String _hx_tmp1;
HXDLIN( 144)		if ((options->indexOf( ::Dynamic(::Cyph_obj::options->__Field(HX_("modestBranding",1f,fb,4c,44),hx::paccDynamic)),null()) > (int)-1)) {
HXLINE( 144)			_hx_tmp1 = HX_("&",26,00,00,00);
            		}
            		else {
HXLINE( 144)			_hx_tmp1 = HX_("",00,00,00,00);
            		}
HXLINE( 137)		::String _hx_tmp2 = (_hx_tmp + _hx_tmp1);
HXLINE( 145)		::String _hx_tmp3;
HXDLIN( 145)		if ((options->indexOf( ::Dynamic(::Cyph_obj::options->__Field(HX_("disableP2P",46,97,a5,b6),hx::paccDynamic)),null()) > (int)-1)) {
HXLINE( 145)			_hx_tmp3 = HX_("$",24,00,00,00);
            		}
            		else {
HXLINE( 145)			_hx_tmp3 = HX_("",00,00,00,00);
            		}
HXLINE( 137)		::String _hx_tmp4 = (_hx_tmp2 + _hx_tmp3);
HXLINE( 146)		::String _hx_tmp5;
HXDLIN( 146)		if ((options->indexOf( ::Dynamic(::Cyph_obj::options->__Field(HX_("nativeCrypto",38,16,6a,3e),hx::paccDynamic)),null()) > (int)-1)) {
HXLINE( 146)			_hx_tmp5 = HX_("%",25,00,00,00);
            		}
            		else {
HXLINE( 146)			_hx_tmp5 = HX_("",00,00,00,00);
            		}
HXLINE( 137)		::String _hx_tmp6 = ((_hx_tmp4 + _hx_tmp5) + id);
HXLINE( 135)		return  ::Dynamic(hx::Anon_obj::Create(2)
            			->setFixed(0,HX_("id",db,5b,00,00),id)
            			->setFixed(1,HX_("link",fa,17,b3,47),(_hx_tmp6 + ::Cyph_obj::generateGuid((int)19))));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Cyph_obj,generateLink,return )

void Cyph_obj::initiateSession(::String apiKey,::Array< int > options, ::Dynamic services, ::Dynamic onData, ::Dynamic onError){
            		HX_BEGIN_LOCAL_FUNC_S2(hx::LocalFunc,_hx_Closure_0, ::Dynamic,linkData, ::Dynamic,onData) HXARGC(1)
            		void _hx_run(::String data){
            			HX_STACKFRAME(&_hx_pos_4d4623eba6a46339_170_initiateSession)
HXLINE( 170)			onData( ::Dynamic(linkData->__Field(HX_("link",fa,17,b3,47),hx::paccDynamic)));
            		}
            		HX_END_LOCAL_FUNC1((void))

            	HX_STACKFRAME(&_hx_pos_4d4623eba6a46339_158_initiateSession)
HXLINE( 159)		if (hx::IsNull( services )) {
HXLINE( 160)			services = ::Cyph_obj::services;
            		}
HXLINE( 163)		 ::Dynamic linkData = ::Cyph_obj::generateLink(options,null());
HXLINE( 165)		::Cyph_obj::request(((( (::String)(services->__Field(HX_("backend",14,bc,87,fb),hx::paccDynamic)) ) + HX_("/preauth/",f3,23,8b,ce)) + ( (::String)(linkData->__Field(HX_("id",db,5b,00,00),hx::paccDynamic)) )),true,::Array_obj< ::Dynamic>::__new(1)->init(0, ::Dynamic(hx::Anon_obj::Create(2)
            			->setFixed(0,HX_("k",6b,00,00,00),HX_("Authorization",d9,69,3c,31))
            			->setFixed(1,HX_("v",76,00,00,00),apiKey))),::Array_obj< ::Dynamic>::__new(0), ::Dynamic(new _hx_Closure_0(linkData,onData)),onError);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC5(Cyph_obj,initiateSession,(void))


Cyph_obj::Cyph_obj()
{
}

bool Cyph_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 7:
		if (HX_FIELD_EQ(inName,"options") ) { outValue = ( options ); return true; }
		if (HX_FIELD_EQ(inName,"request") ) { outValue = request_dyn(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"services") ) { outValue = ( services ); return true; }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"addressSpace") ) { outValue = ( addressSpace ); return true; }
		if (HX_FIELD_EQ(inName,"generateGuid") ) { outValue = generateGuid_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"generateLink") ) { outValue = generateLink_dyn(); return true; }
		break;
	case 15:
		if (HX_FIELD_EQ(inName,"initiateSession") ) { outValue = initiateSession_dyn(); return true; }
	}
	return false;
}

bool Cyph_obj::__SetStatic(const ::String &inName,Dynamic &ioValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 7:
		if (HX_FIELD_EQ(inName,"options") ) { options=ioValue.Cast<  ::Dynamic >(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"services") ) { services=ioValue.Cast<  ::Dynamic >(); return true; }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"addressSpace") ) { addressSpace=ioValue.Cast< ::Array< ::Dynamic> >(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Cyph_obj_sMemberStorageInfo = 0;
static hx::StaticInfo Cyph_obj_sStaticStorageInfo[] = {
	{hx::fsObject /*Array< ::Dynamic >*/ ,(void *) &Cyph_obj::addressSpace,HX_HCSTRING("addressSpace","\x72","\xde","\xab","\x9b")},
	{hx::fsObject /*Dynamic*/ ,(void *) &Cyph_obj::services,HX_HCSTRING("services","\x9e","\x92","\x4b","\xe5")},
	{hx::fsObject /*Dynamic*/ ,(void *) &Cyph_obj::options,HX_HCSTRING("options","\x5e","\x33","\xfe","\xdf")},
	{ hx::fsUnknown, 0, null()}
};
#endif

static void Cyph_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Cyph_obj::__mClass,"__mClass");
	HX_MARK_MEMBER_NAME(Cyph_obj::addressSpace,"addressSpace");
	HX_MARK_MEMBER_NAME(Cyph_obj::services,"services");
	HX_MARK_MEMBER_NAME(Cyph_obj::options,"options");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Cyph_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Cyph_obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(Cyph_obj::addressSpace,"addressSpace");
	HX_VISIT_MEMBER_NAME(Cyph_obj::services,"services");
	HX_VISIT_MEMBER_NAME(Cyph_obj::options,"options");
};

#endif

hx::Class Cyph_obj::__mClass;

static ::String Cyph_obj_sStaticFields[] = {
	HX_HCSTRING("addressSpace","\x72","\xde","\xab","\x9b"),
	HX_HCSTRING("services","\x9e","\x92","\x4b","\xe5"),
	HX_HCSTRING("options","\x5e","\x33","\xfe","\xdf"),
	HX_HCSTRING("generateGuid","\x5e","\xe7","\x41","\x17"),
	HX_HCSTRING("request","\x4f","\xdf","\x84","\x44"),
	HX_HCSTRING("generateLink","\xcf","\xe1","\x86","\x1a"),
	HX_HCSTRING("initiateSession","\xfd","\xc1","\x04","\x67"),
	::String(null())
};

void Cyph_obj::__register()
{
	hx::Object *dummy = new Cyph_obj;
	Cyph_obj::_hx_vtable = *(void **)dummy;
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("Cyph","\x4e","\x7e","\xa5","\x2c");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Cyph_obj::__GetStatic;
	__mClass->mSetStaticField = &Cyph_obj::__SetStatic;
	__mClass->mMarkFunc = Cyph_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Cyph_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Cyph_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Cyph_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Cyph_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Cyph_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

void Cyph_obj::__boot()
{
{
            		HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_hx_Closure_0) HXARGC(1)
            		 ::Dynamic _hx_run(::String s){
            			HX_STACKFRAME(&_hx_pos_4d4623eba6a46339_16_boot)
HXLINE(  16)			return s.charCodeAt((int)0);
            		}
            		HX_END_LOCAL_FUNC1(return)

            	HX_STACKFRAME(&_hx_pos_4d4623eba6a46339_8_boot)
HXDLIN(   8)		addressSpace = ::Array_obj< ::String >::fromData( _hx_array_data_2ca57e4e_10,60)->map( ::Dynamic(new _hx_Closure_0()));
            	}
{
            	HX_STACKFRAME(&_hx_pos_4d4623eba6a46339_19_boot)
HXDLIN(  19)		services =  ::Dynamic(hx::Anon_obj::Create(4)
            			->setFixed(0,HX_("backend",14,bc,87,fb),HX_("https://api.cyph.com",a4,ff,d4,e9))
            			->setFixed(1,HX_("video",7b,14,fc,36),HX_("https://cyph.video/#",5e,73,f8,b7))
            			->setFixed(2,HX_("voice",b2,25,f7,3a),HX_("https://cyph.audio/#",79,e4,a2,1d))
            			->setFixed(3,HX_("chat",d8,5e,bf,41),HX_("https://cyph.im/#",89,b5,ef,78)));
            	}
{
            	HX_STACKFRAME(&_hx_pos_4d4623eba6a46339_26_boot)
HXDLIN(  26)		options =  ::Dynamic(hx::Anon_obj::Create(6)
            			->setFixed(0,HX_("disableP2P",46,97,a5,b6),(int)1)
            			->setFixed(1,HX_("telehealth",46,e6,42,e1),(int)4)
            			->setFixed(2,HX_("video",7b,14,fc,36),(int)5)
            			->setFixed(3,HX_("voice",b2,25,f7,3a),(int)6)
            			->setFixed(4,HX_("nativeCrypto",38,16,6a,3e),(int)3)
            			->setFixed(5,HX_("modestBranding",1f,fb,4c,44),(int)2));
            	}
}

