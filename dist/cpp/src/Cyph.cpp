#include <hxcpp.h>

#include "hxMath.h"
#ifndef INCLUDED_Cyph
#include <Cyph.h>
#endif
#ifndef INCLUDED_SecureRandom
#include <SecureRandom.h>
#endif
#ifndef INCLUDED_haxe_io_Bytes
#include <haxe/io/Bytes.h>
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
	HX_STACK_FRAME("Cyph","generateGuid",0x4feb9d7e,"Cyph.generateGuid","Cyph.hx",28,0x050f2930)
	HX_STACK_ARG(length,"length")
	HX_STACK_LINE(29)
	int tmp = length;		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(29)
	::haxe::io::Bytes tmp1 = ::SecureRandom_obj::getSecureRandomBytes(tmp);		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(29)
	::haxe::io::Bytes randomBytes = tmp1;		HX_STACK_VAR(randomBytes,"randomBytes");
	HX_STACK_LINE(31)
	{
		HX_STACK_LINE(31)
		int _g = (int)0;		HX_STACK_VAR(_g,"_g");
		HX_STACK_LINE(31)
		while((true)){
			HX_STACK_LINE(31)
			bool tmp2 = (_g < length);		HX_STACK_VAR(tmp2,"tmp2");
			HX_STACK_LINE(31)
			bool tmp3 = !(tmp2);		HX_STACK_VAR(tmp3,"tmp3");
			HX_STACK_LINE(31)
			if ((tmp3)){
				HX_STACK_LINE(31)
				break;
			}
			HX_STACK_LINE(31)
			int tmp4 = (_g)++;		HX_STACK_VAR(tmp4,"tmp4");
			HX_STACK_LINE(31)
			int i = tmp4;		HX_STACK_VAR(i,"i");
			HX_STACK_LINE(32)
			{
				HX_STACK_LINE(33)
				int tmp5 = randomBytes->b->__get(i);		HX_STACK_VAR(tmp5,"tmp5");
				HX_STACK_LINE(33)
				Float tmp6 = (Float(tmp5) / Float((int)256));		HX_STACK_VAR(tmp6,"tmp6");
				HX_STACK_LINE(33)
				int tmp7 = ::Cyph_obj::addressSpace->length;		HX_STACK_VAR(tmp7,"tmp7");
				HX_STACK_LINE(33)
				Float tmp8 = (tmp6 * tmp7);		HX_STACK_VAR(tmp8,"tmp8");
				HX_STACK_LINE(32)
				int tmp9 = ::Math_obj::floor(tmp8);		HX_STACK_VAR(tmp9,"tmp9");
				HX_STACK_LINE(32)
				Dynamic tmp10 = ::Cyph_obj::addressSpace->__get(tmp9);		HX_STACK_VAR(tmp10,"tmp10");
				HX_STACK_LINE(32)
				int v = tmp10;		HX_STACK_VAR(v,"v");
				HX_STACK_LINE(32)
				int tmp11 = v;		HX_STACK_VAR(tmp11,"tmp11");
				HX_STACK_LINE(32)
				randomBytes->b[i] = tmp11;
			}
		}
	}
	HX_STACK_LINE(37)
	::String tmp2 = randomBytes->toString();		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(37)
	::String guid = tmp2;		HX_STACK_VAR(guid,"guid");
	HX_STACK_LINE(38)
	int tmp3 = length;		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(38)
	randomBytes->fill((int)0,tmp3,(int)0);
	HX_STACK_LINE(39)
	::String tmp4 = guid;		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(39)
	return tmp4;
}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Cyph_obj,generateGuid,return )

::String Cyph_obj::initiateSession( Array< int > options){
	HX_STACK_FRAME("Cyph","initiateSession",0x9ff79fdd,"Cyph.initiateSession","Cyph.hx",42,0x050f2930)
	HX_STACK_ARG(options,"options")
	HX_STACK_LINE(43)
	bool tmp = (options == null());		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(43)
	if ((tmp)){
		HX_STACK_LINE(44)
		options = Array_obj< int >::__new();
	}
	HX_STACK_LINE(49)
	Dynamic tmp1 = ::Cyph_obj::options;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(49)
	int tmp2 = tmp1->__Field(HX_HCSTRING("video","\x7b","\x14","\xfc","\x36"), hx::paccDynamic );		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(49)
	int tmp3 = options->indexOf(tmp2,null());		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(49)
	int tmp4 = (int)-1;		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(49)
	bool tmp5 = (tmp3 > tmp4);		HX_STACK_VAR(tmp5,"tmp5");
	HX_STACK_LINE(48)
	::String tmp6;		HX_STACK_VAR(tmp6,"tmp6");
	HX_STACK_LINE(49)
	if ((tmp5)){
		HX_STACK_LINE(50)
		Dynamic tmp7 = ::Cyph_obj::services;		HX_STACK_VAR(tmp7,"tmp7");
		HX_STACK_LINE(50)
		tmp6 = tmp7->__Field(HX_HCSTRING("video","\x7b","\x14","\xfc","\x36"), hx::paccDynamic );
	}
	else{
		HX_STACK_LINE(51)
		Dynamic tmp7 = ::Cyph_obj::options;		HX_STACK_VAR(tmp7,"tmp7");
		HX_STACK_LINE(51)
		int tmp8 = tmp7->__Field(HX_HCSTRING("voice","\xb2","\x25","\xf7","\x3a"), hx::paccDynamic );		HX_STACK_VAR(tmp8,"tmp8");
		HX_STACK_LINE(51)
		int tmp9 = options->indexOf(tmp8,null());		HX_STACK_VAR(tmp9,"tmp9");
		HX_STACK_LINE(51)
		int tmp10 = (int)-1;		HX_STACK_VAR(tmp10,"tmp10");
		HX_STACK_LINE(51)
		bool tmp11 = (tmp9 > tmp10);		HX_STACK_VAR(tmp11,"tmp11");
		HX_STACK_LINE(51)
		if ((tmp11)){
			HX_STACK_LINE(52)
			Dynamic tmp12 = ::Cyph_obj::services;		HX_STACK_VAR(tmp12,"tmp12");
			HX_STACK_LINE(52)
			tmp6 = tmp12->__Field(HX_HCSTRING("voice","\xb2","\x25","\xf7","\x3a"), hx::paccDynamic );
		}
		else{
			HX_STACK_LINE(53)
			Dynamic tmp12 = ::Cyph_obj::services;		HX_STACK_VAR(tmp12,"tmp12");
			HX_STACK_LINE(53)
			tmp6 = tmp12->__Field(HX_HCSTRING("chat","\xd8","\x5e","\xbf","\x41"), hx::paccDynamic );
		}
	}
	HX_STACK_LINE(47)
	::String tmp7 = (HX_HCSTRING("https://","\xcf","\xb4","\xae","\x3e") + tmp6);		HX_STACK_VAR(tmp7,"tmp7");
	HX_STACK_LINE(47)
	::String tmp8 = (tmp7 + HX_HCSTRING("/#","\x14","\x29","\x00","\x00"));		HX_STACK_VAR(tmp8,"tmp8");
	HX_STACK_LINE(56)
	Dynamic tmp9 = ::Cyph_obj::options;		HX_STACK_VAR(tmp9,"tmp9");
	HX_STACK_LINE(56)
	int tmp10 = tmp9->__Field(HX_HCSTRING("modestBranding","\x1f","\xfb","\x4c","\x44"), hx::paccDynamic );		HX_STACK_VAR(tmp10,"tmp10");
	HX_STACK_LINE(56)
	int tmp11 = options->indexOf(tmp10,null());		HX_STACK_VAR(tmp11,"tmp11");
	HX_STACK_LINE(56)
	int tmp12 = (int)-1;		HX_STACK_VAR(tmp12,"tmp12");
	HX_STACK_LINE(56)
	bool tmp13 = (tmp11 > tmp12);		HX_STACK_VAR(tmp13,"tmp13");
	HX_STACK_LINE(56)
	::String tmp14;		HX_STACK_VAR(tmp14,"tmp14");
	HX_STACK_LINE(56)
	if ((tmp13)){
		HX_STACK_LINE(56)
		tmp14 = HX_HCSTRING("&","\x26","\x00","\x00","\x00");
	}
	else{
		HX_STACK_LINE(56)
		tmp14 = HX_HCSTRING("","\x00","\x00","\x00","\x00");
	}
	HX_STACK_LINE(47)
	::String tmp15 = (tmp8 + tmp14);		HX_STACK_VAR(tmp15,"tmp15");
	HX_STACK_LINE(57)
	Dynamic tmp16 = ::Cyph_obj::options;		HX_STACK_VAR(tmp16,"tmp16");
	HX_STACK_LINE(57)
	int tmp17 = tmp16->__Field(HX_HCSTRING("disableP2P","\x46","\x97","\xa5","\xb6"), hx::paccDynamic );		HX_STACK_VAR(tmp17,"tmp17");
	HX_STACK_LINE(57)
	int tmp18 = options->indexOf(tmp17,null());		HX_STACK_VAR(tmp18,"tmp18");
	HX_STACK_LINE(57)
	int tmp19 = (int)-1;		HX_STACK_VAR(tmp19,"tmp19");
	HX_STACK_LINE(57)
	bool tmp20 = (tmp18 > tmp19);		HX_STACK_VAR(tmp20,"tmp20");
	HX_STACK_LINE(57)
	::String tmp21;		HX_STACK_VAR(tmp21,"tmp21");
	HX_STACK_LINE(57)
	if ((tmp20)){
		HX_STACK_LINE(57)
		tmp21 = HX_HCSTRING("$","\x24","\x00","\x00","\x00");
	}
	else{
		HX_STACK_LINE(57)
		tmp21 = HX_HCSTRING("","\x00","\x00","\x00","\x00");
	}
	HX_STACK_LINE(47)
	::String tmp22 = (tmp15 + tmp21);		HX_STACK_VAR(tmp22,"tmp22");
	HX_STACK_LINE(58)
	Dynamic tmp23 = ::Cyph_obj::options;		HX_STACK_VAR(tmp23,"tmp23");
	HX_STACK_LINE(58)
	int tmp24 = tmp23->__Field(HX_HCSTRING("nativeCrypto","\x38","\x16","\x6a","\x3e"), hx::paccDynamic );		HX_STACK_VAR(tmp24,"tmp24");
	HX_STACK_LINE(58)
	int tmp25 = options->indexOf(tmp24,null());		HX_STACK_VAR(tmp25,"tmp25");
	HX_STACK_LINE(58)
	int tmp26 = (int)-1;		HX_STACK_VAR(tmp26,"tmp26");
	HX_STACK_LINE(58)
	bool tmp27 = (tmp25 > tmp26);		HX_STACK_VAR(tmp27,"tmp27");
	HX_STACK_LINE(58)
	::String tmp28;		HX_STACK_VAR(tmp28,"tmp28");
	HX_STACK_LINE(58)
	if ((tmp27)){
		HX_STACK_LINE(58)
		tmp28 = HX_HCSTRING("%","\x25","\x00","\x00","\x00");
	}
	else{
		HX_STACK_LINE(58)
		tmp28 = HX_HCSTRING("","\x00","\x00","\x00","\x00");
	}
	HX_STACK_LINE(47)
	::String tmp29 = (tmp22 + tmp28);		HX_STACK_VAR(tmp29,"tmp29");
	HX_STACK_LINE(59)
	::String tmp30 = ::Cyph_obj::generateGuid((int)26);		HX_STACK_VAR(tmp30,"tmp30");
	HX_STACK_LINE(47)
	::String tmp31 = (tmp29 + tmp30);		HX_STACK_VAR(tmp31,"tmp31");
	HX_STACK_LINE(47)
	return tmp31;
}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Cyph_obj,initiateSession,return )


Cyph_obj::Cyph_obj()
{
}

bool Cyph_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 7:
		if (HX_FIELD_EQ(inName,"options") ) { outValue = options; return true;  }
		break;
	case 8:
		if (HX_FIELD_EQ(inName,"services") ) { outValue = services; return true;  }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"addressSpace") ) { outValue = addressSpace; return true;  }
		if (HX_FIELD_EQ(inName,"generateGuid") ) { outValue = generateGuid_dyn(); return true;  }
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
	HX_STACK_FRAME("*","_Function_0_1",0x52002af6,"*._Function_0_1","Cyph.hx",10,0x050f2930)
	HX_STACK_ARG(s,"s")
	{
		HX_STACK_LINE(11)
		Dynamic tmp = s.charCodeAt((int)0);		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(11)
		return tmp;
	}
	return null();
}
HX_END_LOCAL_FUNC1(return)

	addressSpace= Array_obj< ::String >::__new().Add(HX_HCSTRING("0","\x30","\x00","\x00","\x00")).Add(HX_HCSTRING("1","\x31","\x00","\x00","\x00")).Add(HX_HCSTRING("2","\x32","\x00","\x00","\x00")).Add(HX_HCSTRING("3","\x33","\x00","\x00","\x00")).Add(HX_HCSTRING("4","\x34","\x00","\x00","\x00")).Add(HX_HCSTRING("5","\x35","\x00","\x00","\x00")).Add(HX_HCSTRING("6","\x36","\x00","\x00","\x00")).Add(HX_HCSTRING("7","\x37","\x00","\x00","\x00")).Add(HX_HCSTRING("8","\x38","\x00","\x00","\x00")).Add(HX_HCSTRING("9","\x39","\x00","\x00","\x00")).Add(HX_HCSTRING("a","\x61","\x00","\x00","\x00")).Add(HX_HCSTRING("b","\x62","\x00","\x00","\x00")).Add(HX_HCSTRING("c","\x63","\x00","\x00","\x00")).Add(HX_HCSTRING("d","\x64","\x00","\x00","\x00")).Add(HX_HCSTRING("e","\x65","\x00","\x00","\x00")).Add(HX_HCSTRING("f","\x66","\x00","\x00","\x00")).Add(HX_HCSTRING("g","\x67","\x00","\x00","\x00")).Add(HX_HCSTRING("h","\x68","\x00","\x00","\x00")).Add(HX_HCSTRING("i","\x69","\x00","\x00","\x00")).Add(HX_HCSTRING("j","\x6a","\x00","\x00","\x00")).Add(HX_HCSTRING("k","\x6b","\x00","\x00","\x00")).Add(HX_HCSTRING("m","\x6d","\x00","\x00","\x00")).Add(HX_HCSTRING("n","\x6e","\x00","\x00","\x00")).Add(HX_HCSTRING("o","\x6f","\x00","\x00","\x00")).Add(HX_HCSTRING("p","\x70","\x00","\x00","\x00")).Add(HX_HCSTRING("q","\x71","\x00","\x00","\x00")).Add(HX_HCSTRING("r","\x72","\x00","\x00","\x00")).Add(HX_HCSTRING("s","\x73","\x00","\x00","\x00")).Add(HX_HCSTRING("t","\x74","\x00","\x00","\x00")).Add(HX_HCSTRING("u","\x75","\x00","\x00","\x00")).Add(HX_HCSTRING("v","\x76","\x00","\x00","\x00")).Add(HX_HCSTRING("w","\x77","\x00","\x00","\x00")).Add(HX_HCSTRING("x","\x78","\x00","\x00","\x00")).Add(HX_HCSTRING("y","\x79","\x00","\x00","\x00")).Add(HX_HCSTRING("z","\x7a","\x00","\x00","\x00")).Add(HX_HCSTRING("A","\x41","\x00","\x00","\x00")).Add(HX_HCSTRING("B","\x42","\x00","\x00","\x00")).Add(HX_HCSTRING("C","\x43","\x00","\x00","\x00")).Add(HX_HCSTRING("D","\x44","\x00","\x00","\x00")).Add(HX_HCSTRING("E","\x45","\x00","\x00","\x00")).Add(HX_HCSTRING("F","\x46","\x00","\x00","\x00")).Add(HX_HCSTRING("G","\x47","\x00","\x00","\x00")).Add(HX_HCSTRING("H","\x48","\x00","\x00","\x00")).Add(HX_HCSTRING("J","\x4a","\x00","\x00","\x00")).Add(HX_HCSTRING("K","\x4b","\x00","\x00","\x00")).Add(HX_HCSTRING("L","\x4c","\x00","\x00","\x00")).Add(HX_HCSTRING("M","\x4d","\x00","\x00","\x00")).Add(HX_HCSTRING("N","\x4e","\x00","\x00","\x00")).Add(HX_HCSTRING("O","\x4f","\x00","\x00","\x00")).Add(HX_HCSTRING("P","\x50","\x00","\x00","\x00")).Add(HX_HCSTRING("Q","\x51","\x00","\x00","\x00")).Add(HX_HCSTRING("R","\x52","\x00","\x00","\x00")).Add(HX_HCSTRING("S","\x53","\x00","\x00","\x00")).Add(HX_HCSTRING("T","\x54","\x00","\x00","\x00")).Add(HX_HCSTRING("U","\x55","\x00","\x00","\x00")).Add(HX_HCSTRING("V","\x56","\x00","\x00","\x00")).Add(HX_HCSTRING("W","\x57","\x00","\x00","\x00")).Add(HX_HCSTRING("X","\x58","\x00","\x00","\x00")).Add(HX_HCSTRING("Y","\x59","\x00","\x00","\x00")).Add(HX_HCSTRING("Z","\x5a","\x00","\x00","\x00"))->map( Dynamic(new _Function_0_1())).StaticCast< Array<Dynamic> >();
struct _Function_0_2{
	inline static Dynamic Block( ){
		HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Cyph.hx",14,0x050f2930)
		{
			hx::Anon __result = hx::Anon_obj::Create();
			__result->Add(HX_HCSTRING("chat","\xd8","\x5e","\xbf","\x41") , HX_HCSTRING("cyph.im","\x24","\x02","\xbe","\x37"),false);
			__result->Add(HX_HCSTRING("voice","\xb2","\x25","\xf7","\x3a") , HX_HCSTRING("cyph.audio","\x96","\x3a","\x9c","\x87"),false);
			__result->Add(HX_HCSTRING("video","\x7b","\x14","\xfc","\x36") , HX_HCSTRING("cyph.video","\x3b","\xd6","\x17","\x97"),false);
			return __result;
		}
		return null();
	}
};
	services= _Function_0_2::Block();
struct _Function_0_3{
	inline static Dynamic Block( ){
		HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Cyph.hx",20,0x050f2930)
		{
			hx::Anon __result = hx::Anon_obj::Create();
			__result->Add(HX_HCSTRING("voice","\xb2","\x25","\xf7","\x3a") , (int)1,false);
			__result->Add(HX_HCSTRING("video","\x7b","\x14","\xfc","\x36") , (int)2,false);
			__result->Add(HX_HCSTRING("modestBranding","\x1f","\xfb","\x4c","\x44") , (int)3,false);
			__result->Add(HX_HCSTRING("disableP2P","\x46","\x97","\xa5","\xb6") , (int)4,false);
			__result->Add(HX_HCSTRING("nativeCrypto","\x38","\x16","\x6a","\x3e") , (int)5,false);
			return __result;
		}
		return null();
	}
};
	options= _Function_0_3::Block();
}

