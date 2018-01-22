#ifndef INCLUDED_SecureRandom
#define INCLUDED_SecureRandom

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(SecureRandom)
HX_DECLARE_CLASS2(haxe,io,Bytes)


class HXCPP_CLASS_ATTRIBUTES  SecureRandom_obj : public hx::Object{
	public:
		typedef hx::Object super;
		typedef SecureRandom_obj OBJ_;
		SecureRandom_obj();
		Void __construct();

	public:
		inline void *operator new( size_t inSize, bool inContainer=false,const char *inName="SecureRandom")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< SecureRandom_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~SecureRandom_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("SecureRandom","\xfa","\x75","\x84","\xba"); }

		static ::haxe::io::Bytes getSecureRandomBytes( int length);
		static Dynamic getSecureRandomBytes_dyn();

};


#endif /* INCLUDED_SecureRandom */ 
