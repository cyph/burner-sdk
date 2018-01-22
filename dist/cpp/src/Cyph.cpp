#include <hxcpp.h>

#include "hxMath.h"
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

Void Cyph_obj::__construct()
{
	return null();
}

//Cyph_obj::~Cyph_obj() { }

Dynamic Cyph_obj::__CreateEmpty() { return  new Cyph_obj; }
hx::ObjectPtr< Cyph_obj > Cyph_obj::__new()
{  hx::ObjectPtr< Cyph_obj > _result_ = new Cyph_obj();
	_result_->__construct();
	return _result_;}

Dynamic Cyph_obj::__Create(hx::DynamicArray inArgs)
{  hx::ObjectPtr< Cyph_obj > _result_ = new Cyph_obj();
	_result_->__construct();
	return _result_;}

Array< ::Dynamic > Cyph_obj::addressSpace;

Dynamic Cyph_obj::services;

Dynamic Cyph_obj::options;

::String Cyph_obj::generateGuid( int length){
	HX_STACK_FRAME("Cyph","generateGuid",0x4feb9d7e,"Cyph.generateGuid","Cyph.hx",35,0x050f2930)
	HX_STACK_ARG(length,"length")
	HX_STACK_LINE(36)
	int tmp = (length * (int)4);		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(36)
	int byteLength = tmp;		HX_STACK_VAR(byteLength,"byteLength");
	HX_STACK_LINE(37)
	int tmp1 = byteLength;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(37)
	::haxe::io::Bytes tmp2 = ::SecureRandom_obj::getSecureRandomBytes(tmp1);		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(37)
	::haxe::io::Bytes randomBytes = tmp2;		HX_STACK_VAR(randomBytes,"randomBytes");
	HX_STACK_LINE(38)
	::haxe::io::Bytes tmp3 = randomBytes;		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(38)
	::haxe::io::ArrayBufferViewImpl tmp4 = ::haxe::io::_UInt32Array::UInt32Array_Impl__obj::fromBytes(tmp3,null(),null());		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(38)
	::haxe::io::ArrayBufferViewImpl randomNumbers = tmp4;		HX_STACK_VAR(randomNumbers,"randomNumbers");
	HX_STACK_LINE(40)
	{
		HX_STACK_LINE(40)
		int _g = (int)0;		HX_STACK_VAR(_g,"_g");
		HX_STACK_LINE(40)
		while((true)){
			HX_STACK_LINE(40)
			bool tmp5 = (_g < length);		HX_STACK_VAR(tmp5,"tmp5");
			HX_STACK_LINE(40)
			bool tmp6 = !(tmp5);		HX_STACK_VAR(tmp6,"tmp6");
			HX_STACK_LINE(40)
			if ((tmp6)){
				HX_STACK_LINE(40)
				break;
			}
			HX_STACK_LINE(40)
			int tmp7 = (_g)++;		HX_STACK_VAR(tmp7,"tmp7");
			HX_STACK_LINE(40)
			int i = tmp7;		HX_STACK_VAR(i,"i");
			HX_STACK_LINE(41)
			{
				HX_STACK_LINE(42)
				Float tmp8;		HX_STACK_VAR(tmp8,"tmp8");
				HX_STACK_LINE(42)
				{
					HX_STACK_LINE(42)
					int tmp9;		HX_STACK_VAR(tmp9,"tmp9");
					HX_STACK_LINE(42)
					{
						HX_STACK_LINE(42)
						::haxe::io::Bytes tmp10 = randomNumbers->bytes;		HX_STACK_VAR(tmp10,"tmp10");
						HX_STACK_LINE(42)
						::haxe::io::Bytes _this = tmp10;		HX_STACK_VAR(_this,"_this");
						HX_STACK_LINE(42)
						int tmp11 = (int(i) << int((int)2));		HX_STACK_VAR(tmp11,"tmp11");
						HX_STACK_LINE(42)
						int tmp12 = randomNumbers->byteOffset;		HX_STACK_VAR(tmp12,"tmp12");
						HX_STACK_LINE(42)
						int tmp13 = (tmp11 + tmp12);		HX_STACK_VAR(tmp13,"tmp13");
						HX_STACK_LINE(42)
						int pos = tmp13;		HX_STACK_VAR(pos,"pos");
						HX_STACK_LINE(42)
						int tmp14 = _this->b->__get(pos);		HX_STACK_VAR(tmp14,"tmp14");
						HX_STACK_LINE(42)
						int tmp15 = (pos + (int)1);		HX_STACK_VAR(tmp15,"tmp15");
						HX_STACK_LINE(42)
						int tmp16 = _this->b->__get(tmp15);		HX_STACK_VAR(tmp16,"tmp16");
						HX_STACK_LINE(42)
						int tmp17 = (int(tmp16) << int((int)8));		HX_STACK_VAR(tmp17,"tmp17");
						HX_STACK_LINE(42)
						int tmp18 = (int(tmp14) | int(tmp17));		HX_STACK_VAR(tmp18,"tmp18");
						HX_STACK_LINE(42)
						int tmp19 = (pos + (int)2);		HX_STACK_VAR(tmp19,"tmp19");
						HX_STACK_LINE(42)
						int tmp20 = _this->b->__get(tmp19);		HX_STACK_VAR(tmp20,"tmp20");
						HX_STACK_LINE(42)
						int tmp21 = (int(tmp20) << int((int)16));		HX_STACK_VAR(tmp21,"tmp21");
						HX_STACK_LINE(42)
						int tmp22 = (int(tmp18) | int(tmp21));		HX_STACK_VAR(tmp22,"tmp22");
						HX_STACK_LINE(42)
						int tmp23 = (pos + (int)3);		HX_STACK_VAR(tmp23,"tmp23");
						HX_STACK_LINE(42)
						int tmp24 = _this->b->__get(tmp23);		HX_STACK_VAR(tmp24,"tmp24");
						HX_STACK_LINE(42)
						int tmp25 = (int(tmp24) << int((int)24));		HX_STACK_VAR(tmp25,"tmp25");
						HX_STACK_LINE(42)
						tmp9 = (int(tmp22) | int(tmp25));
					}
					HX_STACK_LINE(42)
					int _int = tmp9;		HX_STACK_VAR(_int,"int");
					HX_STACK_LINE(42)
					bool tmp10 = (_int < (int)0);		HX_STACK_VAR(tmp10,"tmp10");
					HX_STACK_LINE(42)
					if ((tmp10)){
						HX_STACK_LINE(42)
						tmp8 = (((Float)4294967296.0) + _int);
					}
					else{
						HX_STACK_LINE(42)
						tmp8 = (_int + ((Float)0.0));
					}
				}
				HX_STACK_LINE(42)
				Float tmp9 = (Float(tmp8) / Float(((Float)4294967296.0)));		HX_STACK_VAR(tmp9,"tmp9");
				HX_STACK_LINE(42)
				int tmp10 = ::Cyph_obj::addressSpace->length;		HX_STACK_VAR(tmp10,"tmp10");
				HX_STACK_LINE(42)
				Float tmp11 = (tmp9 * tmp10);		HX_STACK_VAR(tmp11,"tmp11");
				HX_STACK_LINE(41)
				int tmp12 = ::Math_obj::floor(tmp11);		HX_STACK_VAR(tmp12,"tmp12");
				HX_STACK_LINE(41)
				int tmp13 = ::Std_obj::_int(tmp12);		HX_STACK_VAR(tmp13,"tmp13");
				HX_STACK_LINE(41)
				Dynamic tmp14 = ::Cyph_obj::addressSpace->__get(tmp13);		HX_STACK_VAR(tmp14,"tmp14");
				HX_STACK_LINE(41)
				int v = tmp14;		HX_STACK_VAR(v,"v");
				HX_STACK_LINE(41)
				int tmp15 = v;		HX_STACK_VAR(tmp15,"tmp15");
				HX_STACK_LINE(41)
				randomBytes->b[i] = tmp15;
			}
		}
	}
	HX_STACK_LINE(46)
	::haxe::io::BytesInput tmp5 = ::haxe::io::BytesInput_obj::__new(randomBytes,(int)0,length);		HX_STACK_VAR(tmp5,"tmp5");
	HX_STACK_LINE(46)
	int tmp6 = length;		HX_STACK_VAR(tmp6,"tmp6");
	HX_STACK_LINE(46)
	::String tmp7 = tmp5->readString(tmp6);		HX_STACK_VAR(tmp7,"tmp7");
	HX_STACK_LINE(46)
	::String guid = tmp7;		HX_STACK_VAR(guid,"guid");
	HX_STACK_LINE(47)
	int tmp8 = byteLength;		HX_STACK_VAR(tmp8,"tmp8");
	HX_STACK_LINE(47)
	randomBytes->fill((int)0,tmp8,(int)0);
	HX_STACK_LINE(48)
	::String tmp9 = guid;		HX_STACK_VAR(tmp9,"tmp9");
	HX_STACK_LINE(48)
	return tmp9;
}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Cyph_obj,generateGuid,return )

Void Cyph_obj::request( ::String url,bool post,cpp::ArrayBase headers,cpp::ArrayBase parameters,Dynamic onData,Dynamic onError){
{
		HX_STACK_FRAME("Cyph","request",0x7c76dd2f,"Cyph.request","Cyph.hx",58,0x050f2930)
		HX_STACK_ARG(url,"url")
		HX_STACK_ARG(post,"post")
		HX_STACK_ARG(headers,"headers")
		HX_STACK_ARG(parameters,"parameters")
		HX_STACK_ARG(onData,"onData")
		HX_STACK_ARG(onError,"onError")
		HX_STACK_LINE(107)
		::haxe::Http tmp = ::haxe::Http_obj::__new(url);		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(107)
		::haxe::Http http = tmp;		HX_STACK_VAR(http,"http");
		HX_STACK_LINE(108)
		http->onData = onData;
		HX_STACK_LINE(109)
		http->onError = onError;
		HX_STACK_LINE(111)
		bool tmp1 = post;		HX_STACK_VAR(tmp1,"tmp1");
		HX_STACK_LINE(111)
		if ((tmp1)){
			HX_STACK_LINE(112)
			http->setPostData(HX_HCSTRING("","\x00","\x00","\x00","\x00"));
		}
		HX_STACK_LINE(115)
		{
			HX_STACK_LINE(115)
			int _g = (int)0;		HX_STACK_VAR(_g,"_g");
			HX_STACK_LINE(115)
			while((true)){
				HX_STACK_LINE(115)
				bool tmp2 = (_g < headers->__Field(HX_HCSTRING("length","\xe6","\x94","\x07","\x9f"), hx::paccDynamic ));		HX_STACK_VAR(tmp2,"tmp2");
				HX_STACK_LINE(115)
				bool tmp3 = !(tmp2);		HX_STACK_VAR(tmp3,"tmp3");
				HX_STACK_LINE(115)
				if ((tmp3)){
					HX_STACK_LINE(115)
					break;
				}
				HX_STACK_LINE(115)
				Dynamic tmp4 = headers->__GetItem(_g);		HX_STACK_VAR(tmp4,"tmp4");
				HX_STACK_LINE(115)
				Dynamic o = tmp4;		HX_STACK_VAR(o,"o");
				HX_STACK_LINE(115)
				++(_g);
				HX_STACK_LINE(116)
				::String tmp5 = o->__Field(HX_HCSTRING("k","\x6b","\x00","\x00","\x00"), hx::paccDynamic );		HX_STACK_VAR(tmp5,"tmp5");
				HX_STACK_LINE(116)
				::String tmp6 = o->__Field(HX_HCSTRING("v","\x76","\x00","\x00","\x00"), hx::paccDynamic );		HX_STACK_VAR(tmp6,"tmp6");
				HX_STACK_LINE(116)
				http->setHeader(tmp5,tmp6);
			}
		}
		HX_STACK_LINE(119)
		{
			HX_STACK_LINE(119)
			int _g = (int)0;		HX_STACK_VAR(_g,"_g");
			HX_STACK_LINE(119)
			while((true)){
				HX_STACK_LINE(119)
				bool tmp2 = (_g < parameters->__Field(HX_HCSTRING("length","\xe6","\x94","\x07","\x9f"), hx::paccDynamic ));		HX_STACK_VAR(tmp2,"tmp2");
				HX_STACK_LINE(119)
				bool tmp3 = !(tmp2);		HX_STACK_VAR(tmp3,"tmp3");
				HX_STACK_LINE(119)
				if ((tmp3)){
					HX_STACK_LINE(119)
					break;
				}
				HX_STACK_LINE(119)
				Dynamic tmp4 = parameters->__GetItem(_g);		HX_STACK_VAR(tmp4,"tmp4");
				HX_STACK_LINE(119)
				Dynamic o = tmp4;		HX_STACK_VAR(o,"o");
				HX_STACK_LINE(119)
				++(_g);
				HX_STACK_LINE(120)
				::String tmp5 = o->__Field(HX_HCSTRING("k","\x6b","\x00","\x00","\x00"), hx::paccDynamic );		HX_STACK_VAR(tmp5,"tmp5");
				HX_STACK_LINE(120)
				::String tmp6 = o->__Field(HX_HCSTRING("v","\x76","\x00","\x00","\x00"), hx::paccDynamic );		HX_STACK_VAR(tmp6,"tmp6");
				HX_STACK_LINE(120)
				http->setParameter(tmp5,tmp6);
			}
		}
		HX_STACK_LINE(123)
		bool tmp2 = post;		HX_STACK_VAR(tmp2,"tmp2");
		HX_STACK_LINE(123)
		http->request(tmp2);
	}
return null();
}


STATIC_HX_DEFINE_DYNAMIC_FUNC6(Cyph_obj,request,(void))

Dynamic Cyph_obj::generateLink( Array< int > options,Dynamic services){
	HX_STACK_FRAME("Cyph","generateLink",0x533097ef,"Cyph.generateLink","Cyph.hx",135,0x050f2930)
	HX_STACK_ARG(options,"options")
	HX_STACK_ARG(services,"services")
	HX_STACK_LINE(136)
	::String tmp = ::Cyph_obj::generateGuid((int)7);		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(136)
	::String id = tmp;		HX_STACK_VAR(id,"id");
	HX_STACK_LINE(139)
	::String tmp1 = id;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(141)
	Dynamic tmp2 = ::Cyph_obj::options;		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(141)
	int tmp3 = tmp2->__Field(HX_HCSTRING("telehealth","\x46","\xe6","\x42","\xe1"), hx::paccDynamic );		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(141)
	int tmp4 = options->indexOf(tmp3,null());		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(141)
	int tmp5 = (int)-1;		HX_STACK_VAR(tmp5,"tmp5");
	HX_STACK_LINE(141)
	bool tmp6 = (tmp4 > tmp5);		HX_STACK_VAR(tmp6,"tmp6");
	HX_STACK_LINE(140)
	::String tmp7;		HX_STACK_VAR(tmp7,"tmp7");
	HX_STACK_LINE(141)
	if ((tmp6)){
		HX_STACK_LINE(142)
		tmp7 = services->__Field(HX_HCSTRING("telehealth","\x46","\xe6","\x42","\xe1"), hx::paccDynamic );
	}
	else{
		HX_STACK_LINE(144)
		Dynamic tmp8 = ::Cyph_obj::options;		HX_STACK_VAR(tmp8,"tmp8");
		HX_STACK_LINE(144)
		int tmp9 = tmp8->__Field(HX_HCSTRING("video","\x7b","\x14","\xfc","\x36"), hx::paccDynamic );		HX_STACK_VAR(tmp9,"tmp9");
		HX_STACK_LINE(144)
		int tmp10 = options->indexOf(tmp9,null());		HX_STACK_VAR(tmp10,"tmp10");
		HX_STACK_LINE(144)
		int tmp11 = (int)-1;		HX_STACK_VAR(tmp11,"tmp11");
		HX_STACK_LINE(144)
		bool tmp12 = (tmp10 > tmp11);		HX_STACK_VAR(tmp12,"tmp12");
		HX_STACK_LINE(144)
		if ((tmp12)){
			HX_STACK_LINE(145)
			tmp7 = services->__Field(HX_HCSTRING("video","\x7b","\x14","\xfc","\x36"), hx::paccDynamic );
		}
		else{
			HX_STACK_LINE(147)
			Dynamic tmp13 = ::Cyph_obj::options;		HX_STACK_VAR(tmp13,"tmp13");
			HX_STACK_LINE(147)
			int tmp14 = tmp13->__Field(HX_HCSTRING("voice","\xb2","\x25","\xf7","\x3a"), hx::paccDynamic );		HX_STACK_VAR(tmp14,"tmp14");
			HX_STACK_LINE(147)
			int tmp15 = options->indexOf(tmp14,null());		HX_STACK_VAR(tmp15,"tmp15");
			HX_STACK_LINE(147)
			int tmp16 = (int)-1;		HX_STACK_VAR(tmp16,"tmp16");
			HX_STACK_LINE(147)
			bool tmp17 = (tmp15 > tmp16);		HX_STACK_VAR(tmp17,"tmp17");
			HX_STACK_LINE(147)
			if ((tmp17)){
				HX_STACK_LINE(148)
				tmp7 = services->__Field(HX_HCSTRING("voice","\xb2","\x25","\xf7","\x3a"), hx::paccDynamic );
			}
			else{
				HX_STACK_LINE(149)
				tmp7 = services->__Field(HX_HCSTRING("chat","\xd8","\x5e","\xbf","\x41"), hx::paccDynamic );
			}
		}
	}
	HX_STACK_LINE(153)
	Dynamic tmp8 = ::Cyph_obj::options;		HX_STACK_VAR(tmp8,"tmp8");
	HX_STACK_LINE(153)
	int tmp9 = tmp8->__Field(HX_HCSTRING("modestBranding","\x1f","\xfb","\x4c","\x44"), hx::paccDynamic );		HX_STACK_VAR(tmp9,"tmp9");
	HX_STACK_LINE(153)
	int tmp10 = options->indexOf(tmp9,null());		HX_STACK_VAR(tmp10,"tmp10");
	HX_STACK_LINE(153)
	int tmp11 = (int)-1;		HX_STACK_VAR(tmp11,"tmp11");
	HX_STACK_LINE(153)
	bool tmp12 = (tmp10 > tmp11);		HX_STACK_VAR(tmp12,"tmp12");
	HX_STACK_LINE(153)
	::String tmp13;		HX_STACK_VAR(tmp13,"tmp13");
	HX_STACK_LINE(153)
	if ((tmp12)){
		HX_STACK_LINE(153)
		tmp13 = HX_HCSTRING("!","\x21","\x00","\x00","\x00");
	}
	else{
		HX_STACK_LINE(153)
		tmp13 = HX_HCSTRING("","\x00","\x00","\x00","\x00");
	}
	HX_STACK_LINE(140)
	::String tmp14 = (tmp7 + tmp13);		HX_STACK_VAR(tmp14,"tmp14");
	HX_STACK_LINE(154)
	Dynamic tmp15 = ::Cyph_obj::options;		HX_STACK_VAR(tmp15,"tmp15");
	HX_STACK_LINE(154)
	int tmp16 = tmp15->__Field(HX_HCSTRING("disableP2P","\x46","\x97","\xa5","\xb6"), hx::paccDynamic );		HX_STACK_VAR(tmp16,"tmp16");
	HX_STACK_LINE(154)
	int tmp17 = options->indexOf(tmp16,null());		HX_STACK_VAR(tmp17,"tmp17");
	HX_STACK_LINE(154)
	int tmp18 = (int)-1;		HX_STACK_VAR(tmp18,"tmp18");
	HX_STACK_LINE(154)
	bool tmp19 = (tmp17 > tmp18);		HX_STACK_VAR(tmp19,"tmp19");
	HX_STACK_LINE(154)
	::String tmp20;		HX_STACK_VAR(tmp20,"tmp20");
	HX_STACK_LINE(154)
	if ((tmp19)){
		HX_STACK_LINE(154)
		tmp20 = HX_HCSTRING("$","\x24","\x00","\x00","\x00");
	}
	else{
		HX_STACK_LINE(154)
		tmp20 = HX_HCSTRING("","\x00","\x00","\x00","\x00");
	}
	HX_STACK_LINE(140)
	::String tmp21 = (tmp14 + tmp20);		HX_STACK_VAR(tmp21,"tmp21");
	HX_STACK_LINE(155)
	::String tmp22 = id;		HX_STACK_VAR(tmp22,"tmp22");
	HX_STACK_LINE(140)
	::String tmp23 = (tmp21 + tmp22);		HX_STACK_VAR(tmp23,"tmp23");
	HX_STACK_LINE(156)
	::String tmp24 = ::Cyph_obj::generateGuid((int)19);		HX_STACK_VAR(tmp24,"tmp24");
	HX_STACK_LINE(140)
	::String tmp25 = (tmp23 + tmp24);		HX_STACK_VAR(tmp25,"tmp25");
	struct _Function_1_1{
		inline static Dynamic Block( ::String &tmp1,::String &tmp25){
			HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Cyph.hx",138,0x050f2930)
			{
				hx::Anon __result = hx::Anon_obj::Create();
				__result->Add(HX_HCSTRING("id","\xdb","\x5b","\x00","\x00") , tmp1,false);
				__result->Add(HX_HCSTRING("link","\xfa","\x17","\xb3","\x47") , tmp25,false);
				return __result;
			}
			return null();
		}
	};
	HX_STACK_LINE(138)
	Dynamic tmp26 = _Function_1_1::Block(tmp1,tmp25);		HX_STACK_VAR(tmp26,"tmp26");
	HX_STACK_LINE(138)
	return tmp26;
}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Cyph_obj,generateLink,return )

Void Cyph_obj::initiateSession( ::String apiKey,Array< int > options,Dynamic services,Dynamic onData,Dynamic onError){
{
		HX_STACK_FRAME("Cyph","initiateSession",0x9ff79fdd,"Cyph.initiateSession","Cyph.hx",172,0x050f2930)
		HX_STACK_ARG(apiKey,"apiKey")
		HX_STACK_ARG(options,"options")
		HX_STACK_ARG(services,"services")
		HX_STACK_ARG(onData,"onData")
		HX_STACK_ARG(onError,"onError")
		HX_STACK_LINE(173)
		bool tmp = (options == null());		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(173)
		if ((tmp)){
			HX_STACK_LINE(174)
			options = Array_obj< int >::__new();
		}
		else{
		}
		HX_STACK_LINE(182)
		bool tmp1 = (services == null());		HX_STACK_VAR(tmp1,"tmp1");
		HX_STACK_LINE(182)
		if ((tmp1)){
			HX_STACK_LINE(183)
			Dynamic tmp2 = ::Cyph_obj::services;		HX_STACK_VAR(tmp2,"tmp2");
			HX_STACK_LINE(183)
			services = tmp2;
		}
		else{
		}
		HX_STACK_LINE(191)
		bool tmp2 = (services->__Field(HX_HCSTRING("backend","\x14","\xbc","\x87","\xfb"), hx::paccDynamic ) == null());		HX_STACK_VAR(tmp2,"tmp2");
		HX_STACK_LINE(191)
		if ((tmp2)){
			HX_STACK_LINE(192)
			Dynamic tmp3 = ::Cyph_obj::services;		HX_STACK_VAR(tmp3,"tmp3");
			HX_STACK_LINE(192)
			services->__FieldRef(HX_HCSTRING("backend","\x14","\xbc","\x87","\xfb")) = tmp3->__Field(HX_HCSTRING("backend","\x14","\xbc","\x87","\xfb"), hx::paccDynamic );
		}
		HX_STACK_LINE(194)
		bool tmp3 = (services->__Field(HX_HCSTRING("telehealth","\x46","\xe6","\x42","\xe1"), hx::paccDynamic ) == null());		HX_STACK_VAR(tmp3,"tmp3");
		HX_STACK_LINE(194)
		if ((tmp3)){
			HX_STACK_LINE(195)
			::String tmp4 = (services->__Field(HX_HCSTRING("chat","\xd8","\x5e","\xbf","\x41"), hx::paccDynamic ) + HX_HCSTRING("video/","\x54","\xd7","\x95","\xe5"));		HX_STACK_VAR(tmp4,"tmp4");
			HX_STACK_LINE(195)
			services->__FieldRef(HX_HCSTRING("telehealth","\x46","\xe6","\x42","\xe1")) = tmp4;
		}
		HX_STACK_LINE(197)
		bool tmp4 = (services->__Field(HX_HCSTRING("video","\x7b","\x14","\xfc","\x36"), hx::paccDynamic ) == null());		HX_STACK_VAR(tmp4,"tmp4");
		HX_STACK_LINE(197)
		if ((tmp4)){
			HX_STACK_LINE(198)
			::String tmp5 = (services->__Field(HX_HCSTRING("chat","\xd8","\x5e","\xbf","\x41"), hx::paccDynamic ) + HX_HCSTRING("video/","\x54","\xd7","\x95","\xe5"));		HX_STACK_VAR(tmp5,"tmp5");
			HX_STACK_LINE(198)
			services->__FieldRef(HX_HCSTRING("video","\x7b","\x14","\xfc","\x36")) = tmp5;
		}
		HX_STACK_LINE(200)
		bool tmp5 = (services->__Field(HX_HCSTRING("voice","\xb2","\x25","\xf7","\x3a"), hx::paccDynamic ) == null());		HX_STACK_VAR(tmp5,"tmp5");
		HX_STACK_LINE(200)
		if ((tmp5)){
			HX_STACK_LINE(201)
			::String tmp6 = (services->__Field(HX_HCSTRING("chat","\xd8","\x5e","\xbf","\x41"), hx::paccDynamic ) + HX_HCSTRING("audio/","\x99","\x42","\xe9","\x68"));		HX_STACK_VAR(tmp6,"tmp6");
			HX_STACK_LINE(201)
			services->__FieldRef(HX_HCSTRING("voice","\xb2","\x25","\xf7","\x3a")) = tmp6;
		}
		HX_STACK_LINE(204)
		Dynamic tmp6 = services;		HX_STACK_VAR(tmp6,"tmp6");
		HX_STACK_LINE(204)
		Dynamic tmp7 = ::Cyph_obj::generateLink(options,tmp6);		HX_STACK_VAR(tmp7,"tmp7");
		HX_STACK_LINE(204)
		Dynamic linkData = tmp7;		HX_STACK_VAR(linkData,"linkData");
		HX_STACK_LINE(207)
		::String tmp8 = (services->__Field(HX_HCSTRING("backend","\x14","\xbc","\x87","\xfb"), hx::paccDynamic ) + HX_HCSTRING("/preauth/","\xf3","\x23","\x8b","\xce"));		HX_STACK_VAR(tmp8,"tmp8");
		HX_STACK_LINE(207)
		::String tmp9 = linkData->__Field(HX_HCSTRING("id","\xdb","\x5b","\x00","\x00"), hx::paccDynamic );		HX_STACK_VAR(tmp9,"tmp9");
		HX_STACK_LINE(207)
		::String tmp10 = (tmp8 + tmp9);		HX_STACK_VAR(tmp10,"tmp10");
		struct _Function_1_1{
			inline static Dynamic Block( ::String &apiKey){
				HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Cyph.hx",209,0x050f2930)
				{
					hx::Anon __result = hx::Anon_obj::Create();
					__result->Add(HX_HCSTRING("k","\x6b","\x00","\x00","\x00") , HX_HCSTRING("Authorization","\xd9","\x69","\x3c","\x31"),false);
					__result->Add(HX_HCSTRING("v","\x76","\x00","\x00","\x00") , apiKey,false);
					return __result;
				}
				return null();
			}
		};
		HX_STACK_LINE(209)
		Dynamic tmp11 = _Function_1_1::Block(apiKey);		HX_STACK_VAR(tmp11,"tmp11");
		HX_STACK_LINE(212)
		Dynamic tmp12 = onError;		HX_STACK_VAR(tmp12,"tmp12");

		HX_BEGIN_LOCAL_FUNC_S2(hx::LocalFunc,_Function_1_2,Dynamic,onData,Dynamic,linkData)
		int __ArgCount() const { return 1; }
		Void run(::String data){
			HX_STACK_FRAME("*","_Function_1_2",0x5200ed38,"*._Function_1_2","Cyph.hx",211,0x050f2930)
			HX_STACK_ARG(data,"data")
			{
				HX_STACK_LINE(211)
				::String tmp13 = linkData->__Field(HX_HCSTRING("link","\xfa","\x17","\xb3","\x47"), hx::paccDynamic );		HX_STACK_VAR(tmp13,"tmp13");
				HX_STACK_LINE(211)
				onData(tmp13).Cast< Void >();
			}
			return null();
		}
		HX_END_LOCAL_FUNC1((void))

		HX_STACK_LINE(206)
		::Cyph_obj::request(tmp10,true,cpp::ArrayBase_obj::__new().Add(tmp11),cpp::ArrayBase_obj::__new(), Dynamic(new _Function_1_2(onData,linkData)),tmp12);
	}
return null();
}


STATIC_HX_DEFINE_DYNAMIC_FUNC5(Cyph_obj,initiateSession,(void))


Cyph_obj::Cyph_obj()
{
}

bool Cyph_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 7:
		if (HX_FIELD_EQ(inName,"options") ) { outValue = options; return true;  }
		if (HX_FIELD_EQ(inName,"request") ) { outValue = request_dyn(); return true;  }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"services") ) { outValue = services; return true;  }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"addressSpace") ) { outValue = addressSpace; return true;  }
		if (HX_FIELD_EQ(inName,"generateGuid") ) { outValue = generateGuid_dyn(); return true;  }
		if (HX_FIELD_EQ(inName,"generateLink") ) { outValue = generateLink_dyn(); return true;  }
		break;
	case 15:
		if (HX_FIELD_EQ(inName,"initiateSession") ) { outValue = initiateSession_dyn(); return true;  }
	}
	return false;
}

bool Cyph_obj::__SetStatic(const ::String &inName,Dynamic &ioValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 7:
		if (HX_FIELD_EQ(inName,"options") ) { options=ioValue.Cast< Dynamic >(); return true; }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"services") ) { services=ioValue.Cast< Dynamic >(); return true; }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"addressSpace") ) { addressSpace=ioValue.Cast< Array< ::Dynamic > >(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *sMemberStorageInfo = 0;
static hx::StaticInfo sStaticStorageInfo[] = {
	{hx::fsObject /*Array< ::Dynamic >*/ ,(void *) &Cyph_obj::addressSpace,HX_HCSTRING("addressSpace","\x72","\xde","\xab","\x9b")},
	{hx::fsObject /*Dynamic*/ ,(void *) &Cyph_obj::services,HX_HCSTRING("services","\x9e","\x92","\x4b","\xe5")},
	{hx::fsObject /*Dynamic*/ ,(void *) &Cyph_obj::options,HX_HCSTRING("options","\x5e","\x33","\xfe","\xdf")},
	{ hx::fsUnknown, 0, null()}
};
#endif

static void sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Cyph_obj::__mClass,"__mClass");
	HX_MARK_MEMBER_NAME(Cyph_obj::addressSpace,"addressSpace");
	HX_MARK_MEMBER_NAME(Cyph_obj::services,"services");
	HX_MARK_MEMBER_NAME(Cyph_obj::options,"options");
};

#ifdef HXCPP_VISIT_ALLOCS
static void sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Cyph_obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(Cyph_obj::addressSpace,"addressSpace");
	HX_VISIT_MEMBER_NAME(Cyph_obj::services,"services");
	HX_VISIT_MEMBER_NAME(Cyph_obj::options,"options");
};

#endif

hx::Class Cyph_obj::__mClass;

static ::String sStaticFields[] = {
	HX_HCSTRING("addressSpace","\x72","\xde","\xab","\x9b"),
	HX_HCSTRING("services","\x9e","\x92","\x4b","\xe5"),
	HX_HCSTRING("options","\x5e","\x33","\xfe","\xdf"),
	HX_HCSTRING("generateGuid","\x5e","\xe7","\x41","\x17"),
	HX_HCSTRING("request","\x4f","\xdf","\x84","\x44"),
	HX_HCSTRING("generateLink","\xcf","\xe1","\x86","\x1a"),
	HX_HCSTRING("initiateSession","\xfd","\xc1","\x04","\x67"),
	::String(null()) };

void Cyph_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("Cyph","\x4e","\x7e","\xa5","\x2c");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Cyph_obj::__GetStatic;
	__mClass->mSetStaticField = &Cyph_obj::__SetStatic;
	__mClass->mMarkFunc = sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Cyph_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = sStaticStorageInfo;
#endif
	hx::RegisterClass(__mClass->mName, __mClass);
}

void Cyph_obj::__boot()
{

HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_Function_0_1)
int __ArgCount() const { return 1; }
Dynamic run(::String s){
	HX_STACK_FRAME("*","_Function_0_1",0x52002af6,"*._Function_0_1","Cyph.hx",15,0x050f2930)
	HX_STACK_ARG(s,"s")
	{
		HX_STACK_LINE(16)
		Dynamic tmp = s.charCodeAt((int)0);		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(16)
		return tmp;
	}
	return null();
}
HX_END_LOCAL_FUNC1(return)

	addressSpace= Array_obj< ::String >::__new().Add(HX_HCSTRING("0","\x30","\x00","\x00","\x00")).Add(HX_HCSTRING("1","\x31","\x00","\x00","\x00")).Add(HX_HCSTRING("2","\x32","\x00","\x00","\x00")).Add(HX_HCSTRING("3","\x33","\x00","\x00","\x00")).Add(HX_HCSTRING("4","\x34","\x00","\x00","\x00")).Add(HX_HCSTRING("5","\x35","\x00","\x00","\x00")).Add(HX_HCSTRING("6","\x36","\x00","\x00","\x00")).Add(HX_HCSTRING("7","\x37","\x00","\x00","\x00")).Add(HX_HCSTRING("8","\x38","\x00","\x00","\x00")).Add(HX_HCSTRING("9","\x39","\x00","\x00","\x00")).Add(HX_HCSTRING("a","\x61","\x00","\x00","\x00")).Add(HX_HCSTRING("b","\x62","\x00","\x00","\x00")).Add(HX_HCSTRING("c","\x63","\x00","\x00","\x00")).Add(HX_HCSTRING("d","\x64","\x00","\x00","\x00")).Add(HX_HCSTRING("e","\x65","\x00","\x00","\x00")).Add(HX_HCSTRING("f","\x66","\x00","\x00","\x00")).Add(HX_HCSTRING("g","\x67","\x00","\x00","\x00")).Add(HX_HCSTRING("h","\x68","\x00","\x00","\x00")).Add(HX_HCSTRING("i","\x69","\x00","\x00","\x00")).Add(HX_HCSTRING("j","\x6a","\x00","\x00","\x00")).Add(HX_HCSTRING("k","\x6b","\x00","\x00","\x00")).Add(HX_HCSTRING("m","\x6d","\x00","\x00","\x00")).Add(HX_HCSTRING("n","\x6e","\x00","\x00","\x00")).Add(HX_HCSTRING("o","\x6f","\x00","\x00","\x00")).Add(HX_HCSTRING("p","\x70","\x00","\x00","\x00")).Add(HX_HCSTRING("q","\x71","\x00","\x00","\x00")).Add(HX_HCSTRING("r","\x72","\x00","\x00","\x00")).Add(HX_HCSTRING("s","\x73","\x00","\x00","\x00")).Add(HX_HCSTRING("t","\x74","\x00","\x00","\x00")).Add(HX_HCSTRING("u","\x75","\x00","\x00","\x00")).Add(HX_HCSTRING("v","\x76","\x00","\x00","\x00")).Add(HX_HCSTRING("w","\x77","\x00","\x00","\x00")).Add(HX_HCSTRING("x","\x78","\x00","\x00","\x00")).Add(HX_HCSTRING("y","\x79","\x00","\x00","\x00")).Add(HX_HCSTRING("z","\x7a","\x00","\x00","\x00")).Add(HX_HCSTRING("A","\x41","\x00","\x00","\x00")).Add(HX_HCSTRING("B","\x42","\x00","\x00","\x00")).Add(HX_HCSTRING("C","\x43","\x00","\x00","\x00")).Add(HX_HCSTRING("D","\x44","\x00","\x00","\x00")).Add(HX_HCSTRING("E","\x45","\x00","\x00","\x00")).Add(HX_HCSTRING("F","\x46","\x00","\x00","\x00")).Add(HX_HCSTRING("G","\x47","\x00","\x00","\x00")).Add(HX_HCSTRING("H","\x48","\x00","\x00","\x00")).Add(HX_HCSTRING("J","\x4a","\x00","\x00","\x00")).Add(HX_HCSTRING("K","\x4b","\x00","\x00","\x00")).Add(HX_HCSTRING("L","\x4c","\x00","\x00","\x00")).Add(HX_HCSTRING("M","\x4d","\x00","\x00","\x00")).Add(HX_HCSTRING("N","\x4e","\x00","\x00","\x00")).Add(HX_HCSTRING("O","\x4f","\x00","\x00","\x00")).Add(HX_HCSTRING("P","\x50","\x00","\x00","\x00")).Add(HX_HCSTRING("Q","\x51","\x00","\x00","\x00")).Add(HX_HCSTRING("R","\x52","\x00","\x00","\x00")).Add(HX_HCSTRING("S","\x53","\x00","\x00","\x00")).Add(HX_HCSTRING("T","\x54","\x00","\x00","\x00")).Add(HX_HCSTRING("U","\x55","\x00","\x00","\x00")).Add(HX_HCSTRING("V","\x56","\x00","\x00","\x00")).Add(HX_HCSTRING("W","\x57","\x00","\x00","\x00")).Add(HX_HCSTRING("X","\x58","\x00","\x00","\x00")).Add(HX_HCSTRING("Y","\x59","\x00","\x00","\x00")).Add(HX_HCSTRING("Z","\x5a","\x00","\x00","\x00"))->map( Dynamic(new _Function_0_1())).StaticCast< Array<Dynamic> >();
struct _Function_0_2{
	inline static Dynamic Block( ){
		HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Cyph.hx",19,0x050f2930)
		{
			hx::Anon __result = hx::Anon_obj::Create();
			__result->Add(HX_HCSTRING("backend","\x14","\xbc","\x87","\xfb") , HX_HCSTRING("https://api.cyph.com","\xa4","\xff","\xd4","\xe9"),false);
			__result->Add(HX_HCSTRING("chat","\xd8","\x5e","\xbf","\x41") , HX_HCSTRING("https://cyph.im/#","\x89","\xb5","\xef","\x78"),false);
			__result->Add(HX_HCSTRING("telehealth","\x46","\xe6","\x42","\xe1") , HX_HCSTRING("https://cyph.healthcare/#","\x52","\x8b","\x7b","\x09"),false);
			__result->Add(HX_HCSTRING("video","\x7b","\x14","\xfc","\x36") , HX_HCSTRING("https://cyph.video/#","\x5e","\x73","\xf8","\xb7"),false);
			__result->Add(HX_HCSTRING("voice","\xb2","\x25","\xf7","\x3a") , HX_HCSTRING("https://cyph.audio/#","\x79","\xe4","\xa2","\x1d"),false);
			return __result;
		}
		return null();
	}
};
	services= _Function_0_2::Block();
struct _Function_0_3{
	inline static Dynamic Block( ){
		HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Cyph.hx",27,0x050f2930)
		{
			hx::Anon __result = hx::Anon_obj::Create();
			__result->Add(HX_HCSTRING("disableP2P","\x46","\x97","\xa5","\xb6") , (int)1,false);
			__result->Add(HX_HCSTRING("modestBranding","\x1f","\xfb","\x4c","\x44") , (int)2,false);
			__result->Add(HX_HCSTRING("telehealth","\x46","\xe6","\x42","\xe1") , (int)3,false);
			__result->Add(HX_HCSTRING("video","\x7b","\x14","\xfc","\x36") , (int)4,false);
			__result->Add(HX_HCSTRING("voice","\xb2","\x25","\xf7","\x3a") , (int)5,false);
			return __result;
		}
		return null();
	}
};
	options= _Function_0_3::Block();
}

